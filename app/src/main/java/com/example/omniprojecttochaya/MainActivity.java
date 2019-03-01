package com.example.omniprojecttochaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.omniprojecttochaya.activitylifecycle.OneActivity;
import com.example.omniprojecttochaya.explicitintent.FirstActivity;
import com.example.omniprojecttochaya.fragment.StaticFragmentsActivity;
import com.example.omniprojecttochaya.implicitintent.ImplicitIntent;
import com.example.omniprojecttochaya.listview.ListViewExampleActivity;
import com.example.omniprojecttochaya.omniclass.OmniConstants;
import com.example.omniprojecttochaya.recyclerview.RecyclerViewExample;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        getSupportActionBar();
        if (toolbar != null) {
            toolbar.setTitle("Home");
        }

//master branch
//master branch
        initViews();
        Log.e("inside MainActivity", "inside MainActivity");
    }

    void initViews() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                explictIntent();
                break;
            case R.id.btn2:
                implicitIntent();
                break;
            case R.id.btn3:
                activityLifecycle();
                break;
            case R.id.btn4:
                gotoStaticFragments();
                break;
            case R.id.btn5:
                gotoListview();
                break;
            case R.id.btn6:
                gotoRecyclerViewExample();
                break;
        }
    }

    void explictIntent() {

        Intent to_first = new Intent(MainActivity.this, FirstActivity.class);
        to_first.putExtra(OmniConstants.KEY_NAME, "Hello Hyderabad");
        to_first.putExtra(OmniConstants.KEY_NAME2, "Hello Bangalore");
        startActivity(to_first);
    }

    void implicitIntent() {
        Intent to_implicit = new Intent(MainActivity.this, ImplicitIntent.class);
        startActivity(to_implicit);
    }

    void activityLifecycle() {
        Intent to_actlifecycle = new Intent(MainActivity.this, OneActivity.class);
        startActivity(to_actlifecycle);
    }

    void gotoStaticFragments() {
        Intent to_actlifecycle = new Intent(MainActivity.this, StaticFragmentsActivity.class);
        startActivity(to_actlifecycle);
    }

    void gotoListview() {
        Intent to_actlifecycle = new Intent(MainActivity.this, ListViewExampleActivity.class);
        startActivity(to_actlifecycle);
    }

    void gotoRecyclerViewExample() {
        Intent to_recyclerViewExample = new Intent(MainActivity.this, RecyclerViewExample.class);
        startActivity(to_recyclerViewExample);
    }
}
