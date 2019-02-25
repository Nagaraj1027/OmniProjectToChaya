package com.example.omniprojecttochaya.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.omniprojecttochaya.MainActivity;
import com.example.omniprojecttochaya.R;
import com.example.omniprojecttochaya.login.LoginActivity;
import com.example.omniprojecttochaya.omniclass.OmniClass;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        startHandler();
    }

    void startHandler() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(OmniClass.getLoginStateFromPreferences()){
                    Intent to_mainact = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(to_mainact);
                    finish();
                }
                else{
                    Intent to_mainact = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(to_mainact);
                    finish();
                    //Hello, this is localbranch 2
                }

            }
        }, SPLASH_TIME_OUT);
        Toast.makeText(getApplicationContext(), "Already logged in", Toast.LENGTH_LONG).show();
    }
}
