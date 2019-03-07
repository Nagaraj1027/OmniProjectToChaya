package com.example.omniprojecttochaya.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.omniprojecttochaya.MainActivity;
import com.example.omniprojecttochaya.R;
import com.example.omniprojecttochaya.explicitintent.FirstActivity;

public class ImplicitIntent extends AppCompatActivity {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
        btn1 = findViewById(R.id.btn1);

        Toolbar toolbar = findViewById(R.id.toolbar);
        getSupportActionBar();
        if (toolbar != null) {
            toolbar.setTitle("Home");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //logic
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel://9550575406"));
                    startActivity(callIntent);
                }
            });
        }
    }
}
