package com.drbt.earthquakesafetyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class afterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after);
    }

    public void pets(View v) {
        Intent i = new Intent(this,pets.class);
        startActivity(i);
    }

    public void gasLeaks(View v) {
        Intent i = new Intent(this,gasLeaks.class);
        startActivity(i);
    }

    public void electricalDamage(View v) {
        Intent i = new Intent(this,electricalDamage.class);
        startActivity(i);
    }

    public void waterDamage(View v) {
        Intent i = new Intent(this,waterDamage.class);
        startActivity(i);
    }


}
