package com.example.omniprojecttochaya.launchmodes.singleinstance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.omniprojecttochaya.R;
import com.example.omniprojecttochaya.launchmodes.singletop.SingleTopC;
import com.example.omniprojecttochaya.launchmodes.singletop.SingleTopD;

public class SingeInstanceC extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity c - SingleInstance mode,\n" +
                "goto Activity d - SingleInstance mode");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SingeInstanceC.this, SingeInstanceD.class);
                startActivity(i);

            }
        });

    }
}
