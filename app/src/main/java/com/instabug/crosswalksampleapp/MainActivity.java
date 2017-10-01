package com.instabug.crosswalksampleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.xwalk.core.XWalkView;

public class MainActivity extends AppCompatActivity {

    XWalkView xWalkWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        xWalkWebView= (XWalkView) findViewById(R.id.activity_main_webview);
        xWalkWebView.load("http://www.crosswalk-project.org", null);
    }
}
