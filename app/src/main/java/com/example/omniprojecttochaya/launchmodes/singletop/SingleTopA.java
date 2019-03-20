package com.example.omniprojecttochaya.launchmodes.singletop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.omniprojecttochaya.R;

public class SingleTopA extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity a - SingleTop mode,\n" +
                "goto Activity B - SingleTop mode");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SingleTopA.this, SingleTopB.class);
                startActivity(i);

            }
        });
    }

}
