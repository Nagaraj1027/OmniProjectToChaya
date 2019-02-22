package com.example.omniprojecttochaya.omniclass;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

public class OmniClass extends Application {

    public static SharedPreferences sharedPreferences;
    public static SharedPreferences.Editor editor;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("inside application", "inside application class");
        sharedPreferences = getSharedPreferences("OmniPreferences", MODE_PRIVATE);
        editor = sharedPreferences.edit();

    }

    public static void saveuserNameIntoPreferences(String username) {
        editor.putString(OmniConstants.KEY_USERNAME, username);
        editor.commit();
    }

    public static String getUserNameFromPreferences() {

        String username = sharedPreferences.getString(OmniConstants.KEY_USERNAME, "Hyderabad");
        return username;
    }

    public static void saveuserPasswordIntoPreferences(String password) {
        editor.putString(OmniConstants.KEY_PASSWORD, password);
        editor.commit();
    }

    public static String getPasswordFromPreferences() {
        String password = sharedPreferences.getString(OmniConstants.KEY_PASSWORD, "Hyderabad2");
        return password;
    }

    public static void saveLginStateIntoPreferences(Boolean lState){
        editor.putBoolean(OmniConstants.KEY_LOGINSTATE, lState);
        editor.commit();
    }

    public static Boolean getLoginStateFromPreferences(){
        Boolean lState= sharedPreferences.getBoolean(OmniConstants.KEY_LOGINSTATE,false);
        return lState;
    }
}
