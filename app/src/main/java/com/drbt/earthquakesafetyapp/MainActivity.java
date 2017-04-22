package com.drbt.earthquakesafetyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.preventionBtn);
        b.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,preventionActivity.class);
                        startActivity(i);
                    }
                }
        );

    }

    public void signIn(View v) {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }

    //public void prevention(View v) {
      //  Intent i = new Intent(this,preventionActivity.class);
        //startActivity(i);
    //}

    public void notifyMe(View v) {
        Intent i = new Intent(this,notifyMe.class);
        startActivity(i);
    }

    public void saveMe(View v) {
        Intent i = new Intent(this,saveMe.class);
        startActivity(i);
    }
}
