package com.example.pratyush.task3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    Button btnSubmit;
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText1=(EditText)findViewById(R.id.edt1);
        editText2=(EditText)findViewById(R.id.edt2);
        btnSubmit=(Button)findViewById(R.id.btn3);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namevalue1=("Your User Name is "+editText1.getText().toString());
                String namevalue2=("Your password is "+editText2.getText().toString());
                Intent intent=new Intent(Login.this, Result.class);
                intent.putExtra("NAME",namevalue1);
                intent.putExtra("PASSWORD",namevalue2);
                startActivity(intent);
            }
        });
    }
}
