package com.example.dell.myapplication12;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add, remove, calculate;
    TextView total;
    int coffee = 0, sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button)findViewById(R.id.buttonAddCoffee);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               coffee = coffee+1;
            }
        });

        remove = (Button)findViewById(R.id.buttonRemoveCoffee);
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coffee = coffee - 1;
            }
        });

        calculate = (Button)findViewById(R.id.buttonCalculate);
        total = (TextView)findViewById(R.id.textViewTotal);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum = coffee * 3;
                total.setText("the final price is: "+sum);
                calculate.setTextColor(Color.WHITE);
                calculate.setBackgroundColor(Color.BLUE);
            }
        });




    }
}
