package com.example.omniprojecttochaya.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

public class ServiceTimeCount extends Service {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */

    public int counter = 0;

    public ServiceTimeCount(Context applicationContext) {
        super();

        Log.i("SERVICE", "hService started");
    }

    public ServiceTimeCount() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);

        //instantiate your variables here
       //Logic
        //i call my startUpload method here to doing the task assigned to it

        initializeTimerTask();
        return START_STICKY;
    }

    /**
     * it sets the timer to print the counter every x seconds
     */
    public void initializeTimerTask() {
        // timerTask = new TimerTask() {

        for (int i = 0; i < 4; i++) {
            System.out.println("i is: " + i + "");
            Toast.makeText(getApplicationContext(), i + "", Toast.LENGTH_LONG).show();
        }

        //we can print it on the logs as below
        Log.i("in timer", "in timer ++++  " + (counter++));
        Toast.makeText(getApplicationContext(), " in timer ++++  " + (counter++) + "", Toast.LENGTH_LONG).show();

        //or use the print statement as below
        System.out.println("Timer print " + counter++);

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        stopSelf();
    }
}
