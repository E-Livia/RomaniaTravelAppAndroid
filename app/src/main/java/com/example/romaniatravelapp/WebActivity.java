package com.example.romaniatravelapp;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        //wire
        webView= findViewById(R.id.webView);

        //get url from activity 3
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String url = bundle.getString("data");

        //populate view from url
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}
