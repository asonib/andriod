package com.example.experiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent in = getIntent();
        TextView r1 = (TextView)findViewById(R.id.r1);
        r1.setText(in.getStringExtra("f_name"));

        TextView r = (TextView)findViewById(R.id.r);
        r.setText(in.getStringExtra("l_name"));

        TextView r2 = (TextView)findViewById(R.id.r2);
        r2.setText(in.getStringExtra("p_no"));

        TextView r3 = (TextView)findViewById(R.id.r3);
        r3.setText(in.getStringExtra("email"));
    }
}