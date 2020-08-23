package com.example.experiment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void calSum(View view) {
        EditText et1 = (EditText) findViewById(R.id.num1);
        int val1 = Integer.parseInt(et1.getText().toString());
        EditText et2 = (EditText) findViewById(R.id.num2);
        int val2 = Integer.parseInt(et2.getText().toString());

        int res = val1 + val2;
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(Integer.toString(res));
    }
    public void calDiff(View view) {
        EditText et1 = (EditText) findViewById(R.id.num1);
        int val1 = Integer.parseInt(et1.getText().toString());
        EditText et2 = (EditText) findViewById(R.id.num2);
        int val2 = Integer.parseInt(et2.getText().toString());

        int res = val1 - val2;
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(Integer.toString(res));
    }
    public void calPro(View view) {
        EditText et1 = (EditText) findViewById(R.id.num1);
        int val1 = Integer.parseInt(et1.getText().toString());
        EditText et2 = (EditText) findViewById(R.id.num2);
        int val2 = Integer.parseInt(et2.getText().toString());

        int res = val1 * val2;
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(Integer.toString(res));
    }
    public void calDiv(View view) {
        EditText et1 = (EditText) findViewById(R.id.num1);
        int val1 = Integer.parseInt(et1.getText().toString());
        EditText et2 = (EditText) findViewById(R.id.num2);
        int val2 = Integer.parseInt(et2.getText().toString());
        TextView result = (TextView) findViewById(R.id.result);
        if(val2 == 0){
            result.setText("Infinity");
        }else {
            double res = Double.parseDouble(Integer.toString(val1))/Double.parseDouble(Integer.toString(val2));
            result.setText(Double.toString(res));
        }
    }
    public void clear(View view){
        TextView result = (TextView) findViewById(R.id.result);
        result.setText("0");
        EditText et1 = (EditText) findViewById(R.id.num1);
        et1.setText("");
        EditText et2 = (EditText) findViewById(R.id.num2);
        et2.setText("");
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}