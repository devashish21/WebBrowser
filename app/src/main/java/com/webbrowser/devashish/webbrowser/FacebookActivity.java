package com.webbrowser.devashish.webbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FacebookActivity extends AppCompatActivity {

    private WebView myWebView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        myWebView3 = (WebView)findViewById(R.id.webView1);
        WebSettings webSettings = myWebView3.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView3.loadUrl("https://www.facebook.com/");
        myWebView3.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(myWebView3.canGoBack()) {
            myWebView3.goBack();
        } else {
            super.onBackPressed();
        }
    }
}