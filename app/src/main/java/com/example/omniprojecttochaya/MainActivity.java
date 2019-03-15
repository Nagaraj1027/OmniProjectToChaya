package com.example.omniprojecttochaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.omniprojecttochaya.activitylifecycle.OneActivity;
import com.example.omniprojecttochaya.database.DataActivity;
import com.example.omniprojecttochaya.dynamicfragments.DynamicFragmntsActivity;
import com.example.omniprojecttochaya.explicitintent.FirstActivity;
import com.example.omniprojecttochaya.fragment.StaticFragmentsActivity;
import com.example.omniprojecttochaya.implicitintent.ImplicitIntent;
import com.example.omniprojecttochaya.intentservice.IntentServiceActivity;
import com.example.omniprojecttochaya.jsonparser.JSonActivity;
import com.example.omniprojecttochaya.listview.ListViewExampleActivity;
import com.example.omniprojecttochaya.notificationsFcm.NotificationActivity;
import com.example.omniprojecttochaya.omniclass.OmniConstants;
import com.example.omniprojecttochaya.recyclerview.RecyclerViewExample;
import com.example.omniprojecttochaya.service.ServiceActivity;
import com.example.omniprojecttochaya.volleyserevercalls.VollleyExample1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12,btn13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
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
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
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

            case R.id.btn7:
                gotoDynamicFragments();
                break;

            case R.id.btn8:
                gotoJsonParser();
                break;

            case R.id.btn9:
                gotoVolleyServiceCall();
                break;

            case R.id.btn10:
                gotoService();
                break;

            case R.id.btn11:
                gotoIntentService();
                break;

            case R.id.btn12:
                gotoNotification();
                break;

            case R.id.btn13:
                gotoSqLiteDataBase();
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

    void gotoDynamicFragments() {
        Intent to_recyclerViewExample = new Intent(MainActivity.this, DynamicFragmntsActivity.class);
        startActivity(to_recyclerViewExample);
    }

    void gotoJsonParser() {
        Intent to_recyclerViewExample = new Intent(MainActivity.this, JSonActivity.class);
        startActivity(to_recyclerViewExample);
    }

    void gotoVolleyServiceCall() {
        Intent to_recyclerViewExample = new Intent(MainActivity.this, VollleyExample1.class);
        startActivity(to_recyclerViewExample);
    }

    void gotoIntentService() {
        Intent to_explicitAct = new Intent(MainActivity.this, IntentServiceActivity.class);
        startActivity(to_explicitAct);
    }

    void gotoService() {
        Intent to_explicitAct = new Intent(MainActivity.this, ServiceActivity.class);
        startActivity(to_explicitAct);
    }

    void gotoNotification() {
        Intent to_explicitAct = new Intent(MainActivity.this, NotificationActivity.class);
        startActivity(to_explicitAct);
    }

    void gotoSqLiteDataBase() {
        Intent to_explicitAct = new Intent(MainActivity.this, DataActivity.class);
        startActivity(to_explicitAct);
    }
}
