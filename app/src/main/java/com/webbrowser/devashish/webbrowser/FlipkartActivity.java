package com.webbrowser.devashish.webbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FlipkartActivity extends AppCompatActivity {

    private WebView myWebView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipkart);

        myWebView4 = (WebView)findViewById(R.id.webView4);
        WebSettings webSettings = myWebView4.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView4.loadUrl("https://www.flipkart.com/");
        myWebView4.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(myWebView4.canGoBack()) {
            myWebView4.goBack();
        } else {
            super.onBackPressed();
        }
    }
}