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

public class OneActivity extends AppCompatActivity {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first2);

        btn1 = (Button) findViewById(R.id.btn1);

        Log.e("OneActivity onCreate", "In FirstA acivity onCreate");
        Toast.makeText(getApplicationContext(), "In FirstA acivity onCreate", Toast.LENGTH_LONG).show();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logic
                Intent to_first = new Intent(OneActivity.this, SecondActivity.class);
                to_first.putExtra("key1", "Hello Hyderabad");
                startActivity(to_first);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("OneActivity onStart", "In FirstA acivity onStart");
        Toast.makeText(getApplicationContext(), "In FirstA acivity onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume onResume", "In FirstA acivity onResume");
        Toast.makeText(getApplicationContext(), "In FirstA acivity onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onResume onPause", "In FirstA acivity onPause");
        Toast.makeText(getApplicationContext(), "In FirstA acivity onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop onStop", "In FirstA acivity onStop");
        Toast.makeText(getApplicationContext(), "In FirstA acivity onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy onDestroy", "In FirstA acivity onDestroy");
        Toast.makeText(getApplicationContext(), "In FirstA acivity onDestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onDestroy onRestart", "In FirstA acivity onRestart");
        Toast.makeText(getApplicationContext(), "In FirstA acivity onRestart", Toast.LENGTH_LONG).show();
    }
}
