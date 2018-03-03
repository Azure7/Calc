package com.example.qiying.calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
    }

    public void add(View view) {
        result.setText(String.valueOf(Double.parseDouble(num1.getText().toString()) + Double.parseDouble(num2.getText().toString())));
    }

    public void subtract(View view) {
        result.setText(String.valueOf(Double.parseDouble(num1.getText().toString()) - Double.parseDouble(num2.getText().toString())));
    }

    public void multiply(View view) {
        result.setText(String.valueOf(Double.parseDouble(num1.getText().toString()) * Double.parseDouble(num2.getText().toString())));
    }

    public void devide(View view) {
        result.setText(String.valueOf(Double.parseDouble(num1.getText().toString()) / Double.parseDouble(num2.getText().toString())));
    }
}
