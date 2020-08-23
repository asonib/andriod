package com.example.experiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void toSecond(View view){

        TextView f_name = (TextView) findViewById(R.id.t1);
        String first_name = f_name.getText().toString();

        TextView l_name = (TextView) findViewById(R.id.t2);
        String last_name = l_name.getText().toString();

        TextView p_no = (TextView) findViewById(R.id.t3);
        String phone = p_no.getText().toString();

        TextView email = (TextView) findViewById(R.id.email);
        String e = email.getText().toString();

        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        intent.putExtra("f_name", first_name);
        intent.putExtra("l_name", last_name);
        intent.putExtra("p_no", phone);
        intent.putExtra("email", e);

        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}