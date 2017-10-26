package com.example.pratyush.task3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {
    Button btnSubmit2;
    EditText editText3, editText4, editText5, editText6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        btnSubmit2 = (Button) findViewById(R.id.btn4);
        editText3 = (EditText) findViewById(R.id.edt3);
        editText4 = (EditText) findViewById(R.id.edt4);
        editText5 = (EditText) findViewById(R.id.edt5);
        editText6 = (EditText) findViewById(R.id.edt6);
        btnSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namevalue3=("Your User Name is " + editText3.getText().toString());
                String namevalue4=("Your full Name is "+editText4.getText().toString());
                String namevalue5=("Your Password is "+editText5.getText().toString());
                String namevalue6=("your age is "+editText6.getText().toString());
                Intent intent=new Intent(Signup.this, Result.class);
                intent.putExtra("NAME1", namevalue3);
                intent.putExtra("PASSWORD1", namevalue4);
                intent.putExtra("NAME4", namevalue5);
                intent.putExtra("NAME5", namevalue6);
                startActivity(intent);
            }
        });
    }
}
