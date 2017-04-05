package com.webbrowser.devashish.webbrowser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button amazon = (Button) findViewById(R.id.b2);
        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AmazonActivity.class);
                startActivity(intent);
            }
        });

        Button typeurl = (Button) findViewById(R.id.b5);
        typeurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        Button yahoo = (Button) findViewById(R.id.b3);
        yahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, YahooActivity.class);
                startActivity(intent);
            }
        });
        Button google = (Button) findViewById(R.id.b1);
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GoogleActivity.class);
                startActivity(intent);
            }
        });
        Button flipkart = (Button) findViewById(R.id.b4);
        flipkart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FlipkartActivity.class);
                startActivity(intent);
            }
        });
        Button FACEBOOK = (Button) findViewById(R.id.b6);
        FACEBOOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FacebookActivity.class);
                startActivity(intent);
            }
        });
        Button outlook = (Button) findViewById(R.id.b7);
        outlook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OutlookActivity.class);
                startActivity(intent);
            }
        });
        Button snapdeal = (Button) findViewById(R.id.b8);
        snapdeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SnapdealActivity.class);
                startActivity(intent);
            }
        });
        Button rediff = (Button) findViewById(R.id.b9);
        rediff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RediffActivity.class);
                startActivity(intent);
            }
        });
    }
}
