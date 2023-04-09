package com.example.romaniatravelapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SimpleDetailsActivity extends AppCompatActivity {

    private TextView cityNameTextView;
    private TextView attractionsTextView;
    private TextView descriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_details);

        cityNameTextView=findViewById(R.id.cityName);
        attractionsTextView=findViewById(R.id.attractionsView);
        descriptionTextView=findViewById(R.id.descriptionView);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        City cityData=(City)bundle.getSerializable("data");

        cityNameTextView.setText(cityData.getCityName());
        attractionsTextView.setText(cityData.getAttractions());
        descriptionTextView.setText(cityData.getDescriptions());
    }
}
