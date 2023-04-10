package com.example.romaniatravelapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.net.DatagramPacket;

public class SimpleDetailsActivity extends AppCompatActivity{

    //objects
    private TextView cityNameTextView;
    private TextView attractionsTextView;
    private TextView descriptionTextView;
    private Button showMoreButton;
    private ImageView cityImageView1;
    private ImageView cityImageView2;
    private ImageView cityImageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_details);

        //wire obj with widgets
        cityNameTextView = findViewById(R.id.cityName);
        attractionsTextView = findViewById(R.id.attractionsView);
        descriptionTextView = findViewById(R.id.descriptionView);
        showMoreButton = findViewById(R.id.show_more_button);
        cityImageView1=findViewById(R.id.cityImage1);
        cityImageView2=findViewById(R.id.cityImage2);
        cityImageView3=findViewById(R.id.cityImage3);

        //get cityData from intent
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        City cityData = (City) bundle.getSerializable("data");

        //populate UI
        cityNameTextView.setText(cityData.getCityName());
        attractionsTextView.setText(cityData.getAttractions());
        descriptionTextView.setText(cityData.getDescriptions());

        showMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SimpleDetailsActivity.this, ComplexDetailsActivity.class);
                Bundle bundle1=new Bundle();

                bundle1.putSerializable("data",cityData);
                intent.putExtras(bundle1);
                startActivity(intent);
            }
        });

        String name = cityData.getImg1();
        Log.d("DEBUG ==> ", "point 2");
        name = name.substring(0, name.indexOf("."));
        int imageID = getResources().getIdentifier(name, "drawable",this.getPackageName());
        cityImageView1.setImageResource(imageID);

        Log.d("DEBUG ==> ", "point 3");

        String name2 = cityData.getImg2();
        Log.d("DEBUG ==> ", "point 2");
        name2 = name2.substring(0, name2.indexOf("."));
        int imageID2 = getResources().getIdentifier(name2, "drawable",this.getPackageName());
        cityImageView2.setImageResource(imageID2);

        Log.d("DEBUG ==> ", "point 3");

        String name3 = cityData.getImg3();
        Log.d("DEBUG ==> ", "point 2");
        name3 = name3.substring(0, name3.indexOf("."));
        int imageID3 = getResources().getIdentifier(name3, "drawable",this.getPackageName());
        cityImageView3.setImageResource(imageID3);

        Log.d("DEBUG ==> ", "point 3");
    }
}
