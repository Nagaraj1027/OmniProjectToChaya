package com.example.omniprojecttochaya.launchmodes.singletask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.omniprojecttochaya.R;
import com.example.omniprojecttochaya.launchmodes.singletop.SingleTopD;

public class SingleTaskD extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity D - SingleTask mode,\n" +
                "goto Activity B - SingleTask mode");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  Intent i = new Intent(SingleTaskD.this, SingleTaskB.class);
                //Should launch Activity B with SingleTask mode programatically, it is not possible to do so and test
                startActivity(i);*/

                Toast.makeText(SingleTaskD.this, "Should launch Activity B with SingleTask mode programatically, but it is not possible to do so and test", Toast.LENGTH_LONG).show();
            }
        });

    }
}
