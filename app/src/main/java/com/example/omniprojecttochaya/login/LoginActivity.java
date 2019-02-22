package com.example.omniprojecttochaya.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.omniprojecttochaya.MainActivity;
import com.example.omniprojecttochaya.R;
import com.example.omniprojecttochaya.omniclass.OmniClass;
import com.example.omniprojecttochaya.omniclass.OmniConstants;

public class LoginActivity extends AppCompatActivity {

    EditText userName, passWord;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = findViewById(R.id.userName);
        passWord = findViewById(R.id.passWord);
        login = findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUserName, getPassword;

                getUserName = userName.getText().toString();
                getPassword = passWord.getText().toString();

                if (!(getUserName.isEmpty() && !(getPassword.isEmpty()))) {

                    OmniClass.saveuserNameIntoPreferences(getUserName);
                    OmniClass.saveuserPasswordIntoPreferences(getPassword);
                    OmniClass.saveLginStateIntoPreferences(true);

                    System.out.println("inserted prerenName " + OmniClass.getUserNameFromPreferences());
                    System.out.println("inserted preferPassword " + OmniClass.getPasswordFromPreferences());
                    System.out.println("inserted preferstate " + OmniClass.getLoginStateFromPreferences());

                    Toast.makeText(getApplicationContext(), "Lgin successful", Toast.LENGTH_LONG).show();
                    Intent to_home = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(to_home);

                } else {
                    Toast.makeText(getApplicationContext(), "Please enter Username and Password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
