package com.example.omniprojecttochaya.intentservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.widget.Toast;


public class MyIntentReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("inside onReceive ");

        String name = intent.getStringExtra("name");

        Toast.makeText(context, "name is" + name, Toast.LENGTH_LONG).show();
    }
}
