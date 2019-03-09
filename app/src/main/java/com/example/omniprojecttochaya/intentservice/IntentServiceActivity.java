package com.example.omniprojecttochaya.intentservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.omniprojecttochaya.R;
public class IntentServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_service);

        startIntentService();
    }

    void startIntentService() {
        Intent intent = new Intent(IntentServiceActivity.this, TimeCountService.class);
        intent.putExtra("foo", "www.google.com");
        startService(intent);
    }

}
