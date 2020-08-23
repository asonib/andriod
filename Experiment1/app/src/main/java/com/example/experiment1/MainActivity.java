package com.example.experiment1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void increaseSize(View view){
        TextView textMain = (TextView) findViewById(R.id.textViewTop);
        float size = textMain.getTextSize();
        System.out.println(size);
        textMain.setTextSize(TypedValue.COMPLEX_UNIT_PX, size+2.0f);
    }

    public void decreaseSize(View view){
        TextView textMain = (TextView) findViewById(R.id.textViewTop);
        float size = textMain.getTextSize();
        System.out.println(size);
        textMain.setTextSize(TypedValue.COMPLEX_UNIT_PX, size-2.0f);
    }

    public void changeColor(View view){
        TextView textMain = (TextView) findViewById(R.id.textViewTop);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        textMain.setTextColor(color);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}