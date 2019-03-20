package com.example.omniprojecttochaya.launchmodes.singletask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.omniprojecttochaya.R;
import com.example.omniprojecttochaya.launchmodes.singletop.SingleTopA;
import com.example.omniprojecttochaya.launchmodes.singletop.SingleTopB;

public class SingleTaskA extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity a - SingleTask mode,\n" +
                "goto Activity B - SingleTask mode");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SingleTaskA.this, SingleTaskB.class);
                startActivity(i);

            }
        });

    }
}
