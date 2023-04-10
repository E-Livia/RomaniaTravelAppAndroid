package com.example.romaniatravelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ComplexDetailsActivity extends AppCompatActivity {

    private TextView cityNameTextView;
    private TextView descriptionTextView;
    private Button webButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complex_details);

        cityNameTextView = findViewById(R.id.complexCityName);
        descriptionTextView = findViewById(R.id.complexDescriptionView);
        webButton=findViewById(R.id.webButton);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        City cityData = (City) bundle.getSerializable("data");

        cityNameTextView.setText("About "+cityData.getCityName());
        descriptionTextView.setText(cityData.getDescriptions());

        webButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create intent and bundle
                Intent intent1 = new Intent(ComplexDetailsActivity.this, WebActivity.class);
                Bundle bundle1 = new Bundle();

                // bundle data
                bundle1.putString("data", cityData.getUrl());
                intent1.putExtras(bundle1);

                startActivity(intent1);
            }
        });
    }
}