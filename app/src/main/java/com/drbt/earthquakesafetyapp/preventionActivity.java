package com.drbt.earthquakesafetyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class preventionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);

    }

    public void during(View v) {
        Intent i = new Intent(this,duringActivity.class);
        startActivity(i);
    }

    public void before(View v) {
        Intent i = new Intent(this,beforeActivity.class);
        startActivity(i);
    }

    public void after(View v) {
        Intent i = new Intent(this,afterActivity.class);
        startActivity(i);
    }
}
