package com.webbrowser.devashish.webbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class RediffActivity extends AppCompatActivity {


    private WebView myWebView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rediff);

        myWebView6 = (WebView)findViewById(R.id.webView6);
        WebSettings webSettings = myWebView6.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView6.loadUrl("http://www.rediff.com/");
        myWebView6.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(myWebView6.canGoBack()) {
            myWebView6.goBack();
        } else {
            super.onBackPressed();
        }
    }
}