package com.dicoding.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.String.*;

public class MainActivity extends AppCompatActivity {

    public void onClick (View V) {
        EditText userName = (EditText) findViewById(R.id.userName);
        EditText passWord = (EditText) findViewById(R.id.Password);
        Log.i("Username",userName.getText().toString());
        Log.i("Password",passWord.getText().toString());

        if (userName.length() !=0 ) {
            Toast.makeText(MainActivity.this, format("Welcome %s", userName.getText().toString()), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Please enter user name for login", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}