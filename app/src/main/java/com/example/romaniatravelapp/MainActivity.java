package com.example.romaniatravelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface{
    private RecyclerView list = null;
    private CityAdapter adapter = null;
    private Cities cities = new Cities();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // setup list
        list = findViewById(R.id.recyclerView);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setItemAnimator(new DefaultItemAnimator());

        // adapter
        adapter = new CityAdapter(this, R.layout.city_item, cities.getData(), this);
        list.setAdapter(adapter);
    }

    @Override
    public void onClickItem(int position) {
        // make an intent and a bundle
        Intent intent = new Intent(MainActivity.this, SimpleDetailsActivity.class);
        Bundle bundle = new Bundle();

        // get the data
        City cityData = cities.getCity(position);
        bundle.putSerializable("data", cityData);
        intent.putExtras(bundle);

        // start activity
        startActivity(intent);
    }
}
