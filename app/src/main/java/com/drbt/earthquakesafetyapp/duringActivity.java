package com.drbt.earthquakesafetyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class duringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_during);
    }

    public void indoor(View v) {
        Intent i = new Intent(this,indoor.class);
        startActivity(i);
    }

    public void outdoor(View v) {
        Intent i = new Intent(this,outdoor.class);
        startActivity(i);
    }

    public void movingVehicle(View v) {
        Intent i = new Intent(this,movingVehicle.class);
        startActivity(i);
    }

    public void damagedBuilding(View v) {
        Intent i = new Intent(this,damagedBuilding.class);
        startActivity(i);
    }

    public void afterShock(View v) {
        Intent i = new Intent(this,afterShock.class);
        startActivity(i);
    }

    public void help(View v) {
        Intent i = new Intent(this,help.class);
        startActivity(i);
    }
}
