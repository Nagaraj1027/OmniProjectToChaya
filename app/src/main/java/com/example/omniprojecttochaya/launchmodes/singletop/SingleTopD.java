package com.example.omniprojecttochaya.launchmodes.singletop;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.omniprojecttochaya.R;

import static android.content.Context.NOTIFICATION_SERVICE;

public class SingleTopD extends AppCompatActivity {

     Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity d - SingleTop mode,\n" +
                "Again goto Activity d - SingleTop mode");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SingleTopD.this, SingleTopD.class);
                startActivity(i);

                Toast.makeText(SingleTopD.this, "Activity D is not recreated as its SingleTop", Toast.LENGTH_LONG).show();

            }
        });

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        notify("onNewIntent");
    }

    private void notify(String methodName) {

        String name = this.getClass().getName();
        String[] strings = name.split("\\.");


        Notification noti = new Notification.Builder(SingleTopD.this)
                .setContentTitle(methodName + "" + strings[strings.length - 1])
                .setAutoCancel(true).setSmallIcon(R.drawable.avatarupload)
                .setContentText(name).build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify((int) System.currentTimeMillis(), noti);

    }

}
