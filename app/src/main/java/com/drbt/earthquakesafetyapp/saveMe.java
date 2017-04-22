package com.drbt.earthquakesafetyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class saveMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_me);
    }

    public void turnOn(View v) {
        Toast.makeText(this,"This feature is not available in the demo version",Toast.LENGTH_LONG).show();
    }
}
