package com.tyffah.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText num1,num2;
    private TextView result;
    private Button add,sub,div,mult,modl,pwr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        result = (TextView)findViewById(R.id.result);
        add=(Button)findViewById(R.id.btnpower);
        sub=(Button)findViewById(R.id.btnmodulus);

    }

    public void addition(View view) {
        int numb1 = Integer.parseInt(num1.getText().toString());
        int numb2 = Integer.parseInt(num2.getText().toString());

        int sum = numb1 + numb2;

        result.setText(String.valueOf(sum));


    }

    public void subtractio(View view) {
        int numb1 = Integer.parseInt(num1.getText().toString());
        int numb2 = Integer.parseInt(num2.getText().toString());

        int sum = numb1 - numb2;

        result.setText(String.valueOf(sum));
    }

    public void division(View view) {
        int numb1 = Integer.parseInt(num1.getText().toString());
        int numb2 = Integer.parseInt(num2.getText().toString());

        int sum = numb1 / numb2;

        result.setText(String.valueOf(sum));
    }

    public void multiplication(View view) {
        int numb1 = Integer.parseInt(num1.getText().toString());
        int numb2 = Integer.parseInt(num2.getText().toString());

        int sum = numb1 * numb2;

        result.setText(String.valueOf(sum));

    }

    public void power(View view) {
        int numb1 = Integer.parseInt(num1.getText().toString());
        int numb2 = Integer.parseInt(num2.getText().toString());

        int sum = numb1 ^ numb2;

        result.setText(String.valueOf(sum));

    }

    public void modulas(View view) {
        int numb1 = Integer.parseInt(num1.getText().toString());
        int numb2 = Integer.parseInt(num2.getText().toString());

        int sum = numb1  % numb2;

        result.setText(String.valueOf(sum));
    }
}