package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class otakustream extends AppCompatActivity {
    WebView  mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otakustream);
        mywebview= (WebView) findViewById(R.id.webViewid2);
        mywebview.loadUrl("http://www.chia-anime.me/");
        mywebview.setWebViewClient(new WebViewClient());
        WebSettings webSettings = mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if(mywebview.canGoBack()){
            mywebview.goBack();
        }
        else {
            super.onBackPressed();


        }
    }
}
