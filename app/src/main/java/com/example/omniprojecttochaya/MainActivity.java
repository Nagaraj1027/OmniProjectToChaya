package com.example.omniprojecttochaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.omniprojecttochaya.explicitintent.FirstActivity;
import com.example.omniprojecttochaya.implicitintent.ImplicitIntent;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logic
                Intent to_first=new Intent(MainActivity.this, FirstActivity.class);
                to_first.putExtra("key1","Hello Hyderabad");
                startActivity(to_first);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logic
                Intent to_implicit=new Intent(MainActivity.this, ImplicitIntent.class);
                startActivity(to_implicit);
            }
        });


        initViews();
    }

    void initViews() {
        // logic
    }
}
