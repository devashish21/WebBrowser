package com.webbrowser.devashish.webbrowser;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AmazonActivity extends AppCompatActivity {

    private WebView myWebView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon);

        myWebView2 = (WebView)findViewById(R.id.webView2);
        WebSettings webSettings = myWebView2.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView2.loadUrl("http://www.amazon.in/");
        myWebView2.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(myWebView2.canGoBack()) {
            myWebView2.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
