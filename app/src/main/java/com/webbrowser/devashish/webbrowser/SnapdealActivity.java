package com.webbrowser.devashish.webbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SnapdealActivity extends AppCompatActivity {


    private WebView myWebView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snapdeal);

        myWebView7 = (WebView)findViewById(R.id.webView7);
        WebSettings webSettings = myWebView7.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView7.loadUrl("https://www.snapdeal.com/");
        myWebView7.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(myWebView7.canGoBack()) {
            myWebView7.goBack();
        } else {
            super.onBackPressed();
        }
    }
}