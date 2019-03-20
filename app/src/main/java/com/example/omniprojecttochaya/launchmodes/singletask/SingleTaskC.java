package com.example.omniprojecttochaya.launchmodes.singletask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.omniprojecttochaya.R;

public class SingleTaskC extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity C - SingleTask mode,\n" +
                "goto Activity D - SingleTask mode");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SingleTaskC.this, SingleTaskD.class);
                i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(i);

            }
        });

    }
}
