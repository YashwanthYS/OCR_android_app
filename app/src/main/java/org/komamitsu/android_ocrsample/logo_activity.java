package org.komamitsu.android_ocrsample;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class logo_activity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo_layout);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent logoIntent = new Intent(logo_activity.this,MainActivity.class);
                startActivity(logoIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
