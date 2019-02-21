package com.example.omniprojecttochaya.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.omniprojecttochaya.MainActivity;
import com.example.omniprojecttochaya.R;
import com.example.omniprojecttochaya.omniclass.OmniConstants;


public class FirstActivity extends AppCompatActivity {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btn1 = (Button) findViewById(R.id.btn1);

        String name = getIntent().getStringExtra(OmniConstants.KEY_NAME);
        String name2 = getIntent().getStringExtra(OmniConstants.KEY_NAME);
        System.out.println(name);
        System.out.println(name2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logic
                Intent to_mainact = new Intent(FirstActivity.this, MainActivity.class);
                startActivity(to_mainact);
            }
        });
    }
}
