package com.example.omniprojecttochaya.omniclass;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

public class OmniClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("inside application", "inside application class");
    }
}
