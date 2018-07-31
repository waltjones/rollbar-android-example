package com.example.basoko.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rollbar.android.Rollbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Rollbar rollbar = Rollbar.init(this, "<POST_CLIENT_TOKEN>", "development", true, true);
        rollbar.error(new Error("This is an error"), "And this is the description");

    }
}
