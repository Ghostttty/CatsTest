package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText email,pass;

    private static final String emailTrue="example@mail.ru";
    private static final String passTrue="123456789";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    public void login(){
        btn=(Button)findViewById(R.id.button);
        email=(EditText)findViewById(R.id.editTextTextEmailAddress);
        pass=(EditText)findViewById(R.id.editTextTextPassword);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(emailTrue.equals(String.valueOf(email.getText()))&&passTrue.equals(String.valueOf(pass.getText()))){
                            Intent intent = new Intent(MainActivity.this,WorkActiviry.class);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(MainActivity.this,"Неверный логин или пароль",Toast.LENGTH_LONG).show();
                        }

                    }
                }
        );
    }
}