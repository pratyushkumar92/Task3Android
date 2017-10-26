package com.example.pratyush.task3;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView tv1, tv2,tv3,tv4,tv5,tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv1=(TextView)findViewById(R.id.txtv1);
        tv2=(TextView)findViewById(R.id.txtv2);
        tv3=(TextView)findViewById(R.id.txtv3);
        tv4=(TextView)findViewById(R.id.txtv4);
        tv5=(TextView)findViewById(R.id.txtv5);
        tv6=(TextView)findViewById(R.id.txtv6);
        tv5.setText(getIntent().getStringExtra("NAME"));
        tv6.setText(getIntent().getStringExtra("PASSWORD"));
        tv1.setText(getIntent().getStringExtra("NAME1"));
        tv2.setText(getIntent().getStringExtra("PASSWORD1"));
        tv3.setText(getIntent().getStringExtra("NAME4"));
        tv4.setText(getIntent().getStringExtra("NAME5"));
    }
}
