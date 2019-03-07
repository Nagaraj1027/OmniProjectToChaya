package com.example.omniprojecttochaya.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.omniprojecttochaya.MainActivity;
import com.example.omniprojecttochaya.R;
import com.example.omniprojecttochaya.explicitintent.FirstActivity;

public class SecondActivity extends AppCompatActivity {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn1= findViewById(R.id.btn1);
        Log.e("Second acivity onCreate", "In Second acivity onCreate");
        Toast.makeText(getApplicationContext(), "In Second acivity onCreate", Toast.LENGTH_LONG).show();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logic
                Intent to_first=new Intent(SecondActivity.this, OneActivity.class);
                to_first.putExtra("key1","Hello Hyderabad");
                startActivity(to_first);
            }
        });
    }

    @Override
    protected void onStart() {
        //hello
        super.onStart();
        Log.e("Second acivity onStart", "In Second acivity onStart");
        Toast.makeText(getApplicationContext(), "In Second acivity onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Second acivity onResume", "In Second acivity onResume");
        Toast.makeText(getApplicationContext(), "In Second acivity onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Second acivity onPause", "In Second acivity onPause");
        Toast.makeText(getApplicationContext(), "In Second acivity onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Second acivity onStop", "In Second acivity onStop");
        Toast.makeText(getApplicationContext(), "In Second acivity onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Second acivit onDestroy", "In Second acivity onDestroy");
        Toast.makeText(getApplicationContext(), "In Second acivity onDestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Second acivit onRestart", "In Second acivity onRestart");
        Toast.makeText(getApplicationContext(), "In Second acivity onRestart", Toast.LENGTH_LONG).show();
    }
}
