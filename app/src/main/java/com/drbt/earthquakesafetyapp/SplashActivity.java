package com.drbt.earthquakesafetyapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.drbt.earthquakesafetyapp.MainActivity;

import java.util.concurrent.TimeUnit;

public class SplashActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        //setContentView(R.layout.splash);
//
////        ImageView img = (ImageView)findViewById(R.id.logo);
////        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
////
////        img.startAnimation(animRotate);
//
//        //SystemClock.sleep(TimeUnit.SECONDS.toMillis(1)); //wait 1 second
//
//        Intent intent = new Intent(this, MainActivity.class); //then start main activity
//        startActivity(intent);
//        finish();
//    }

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash);




//        TextView name = (TextView)findViewById(R.id.appName);
//        Typeface font = Typeface.createFromAsset(getAssets(), "sketchvetica.ttf");
//        name.setTypeface(font);

        //SystemClock.sleep(1500); //wait 0.5 second
        ImageView img = (ImageView)findViewById(R.id.logo);
        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate);

       img.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate));

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }


}
