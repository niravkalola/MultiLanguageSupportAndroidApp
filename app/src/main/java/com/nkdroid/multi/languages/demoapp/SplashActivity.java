package com.nkdroid.multi.languages.demoapp;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new CountDownTimer(1000,1000){

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent i=new Intent(SplashActivity.this,ChangeLanguageActivity.class);
                startActivity(i);
                finish();
            }
        }.start();
    }
}
