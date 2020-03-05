package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText Username;
    EditText Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username.findViewById(R.id.Username);
        Password.findViewById(R.id.Password);
        login.findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                login();
            }
        });
    }

    private void login(){
            Intent i = new Intent(MainActivity.this , ListActivity.class);
            startActivity(i);
    }

}
