package com.webbrowser.devashish.webbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class OutlookActivity extends AppCompatActivity {


    private WebView myWebView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outlook);

        myWebView5 = (WebView)findViewById(R.id.webView5);
        WebSettings webSettings = myWebView5.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView5.loadUrl("https://outlook.live.com/owa/");
        myWebView5.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(myWebView5.canGoBack()) {
            myWebView5.goBack();
        } else {
            super.onBackPressed();
        }
    }
}