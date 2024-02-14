package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BMICalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalc);
        EditText weightInput= findViewById(R.id.weightInput);
        EditText heightInput= findViewById(R.id.heightInput);
        Button calculate= findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String weight=weightInput.getText().toString();
                int intWeight = Integer.parseInt(weight);
                String height=weightInput.getText().toString();
                int intHeight = Integer.parseInt(weight);
                int BMI= intWeight/intHeight^2;


            }
        });
    }
}