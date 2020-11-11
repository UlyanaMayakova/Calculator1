package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button dot;
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inIt();
    }

    private void inIt() {

        result = findViewById(R.id.result);

        dot = findViewById(R.id.dot_btn);

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(dot.getText().toString());
            }
        });

        one = findViewById(R.id.one_btn);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(one.getText().toString());
            }
        });

        zero = findViewById(R.id.zero_btn);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(zero.getText().toString());
            }
        });

        two = findViewById(R.id.two_btn);

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(two.getText().toString());
            }
        });

        three = findViewById(R.id.three_btn);

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(three.getText().toString());
            }
        });

        four = findViewById(R.id.four_btn);

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(four.getText().toString());
            }
        });

        five = findViewById(R.id.five_btn);

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(five.getText().toString());
            }
        });

        six = findViewById(R.id.six_btn);

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(six.getText().toString());
            }
        });

        seven = findViewById(R.id.seven_btn);

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(seven.getText().toString());
            }
        });

        eight = findViewById(R.id.eight_btn);

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(eight.getText().toString());
            }
        });

        nine = findViewById(R.id.nine_btn);

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append(nine.getText().toString());
            }
        });

    }
}