package com.drbt.earthquakesafetyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class beforeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before);
    }

    public void checkforHazard(View v) {
        Intent i = new Intent(this,checkForHazard.class);
        startActivity(i);
    }

    public void identifySafePlace(View v) {
        Intent i = new Intent(this,identifySafePlace.class);
        startActivity(i);
    }

    public void locateSafePlace(View v) {
        Intent i = new Intent(this,safePlaceOutdoor.class);
        startActivity(i);
    }

    public void makeFamilyAware(View v) {
        Intent i = new Intent(this,makeSureFamilyKnows.class);
        startActivity(i);
    }

    public void contactLocalAuthority(View v) {
        Intent i = new Intent(this,contactLocalAuthority.class);
        startActivity(i);
    }

    public void safetyKit(View v) {
        Intent i = new Intent(this,emergencySupply.class);
        startActivity(i);
    }
}
