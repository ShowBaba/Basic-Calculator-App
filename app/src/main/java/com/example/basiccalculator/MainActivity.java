package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //define vars

    double input_1 = 0, input_2 = 0;

    TextView result;
    boolean Addition, Subtraction, Multiplication, Division, mRemainder, decimal;
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, clear_button, button_delete, button_modulo, button_pow, button_sqrt,
    button_divide, button_multiply, button_minus, button_add, button_point, button_equals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //call views by ids

        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_delete = findViewById(R.id.button_delete);
        button_modulo = findViewById(R.id.button_modulo);
        button_sqrt = findViewById(R.id.button_sqrt);
        button_pow = findViewById(R.id.button_pow);
        button_divide = findViewById(R.id.button_divide);
        button_multiply = findViewById(R.id.button_multiply);
        button_minus = findViewById(R.id.button_minus);
        button_add = findViewById(R.id.button_add);
        button_point = findViewById(R.id.button_point);
        button_equals = findViewById(R.id.button_equals);
        clear_button = findViewById(R.id.clear_button);
        result = findViewById((R.id.result));
        result.setBackground(null);
        result.setTextSize(70);
        result.setTextIsSelectable(true);


        //set onClickListener for each views

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "6");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "7");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "8");
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "9");
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "0");
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().length() != 0){
                    input_1 = Float.parseFloat(result.getText() + "");
                    Addition = true;
                    decimal = false;
                    result.setText(null);
                }
            }
        });

        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().length() != 0){
                    input_1 = Float.parseFloat(result.getText() + "");
                    Subtraction = true;
                    decimal = false;
                    result.setText(null);
                }
            }
        });

        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().length() != 0){
                    input_1 = Float.parseFloat(result.getText() + "");
                    Division = true;
                    decimal = false;
                    result.setText(null);
                }
            }
        });

        button_modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().length() != 0){
                    input_1 = Float.parseFloat((result.getText() + ""));
                    mRemainder = true;
                    decimal = false;
                    result.setText(null);
                }
            }
        });

        button_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtraction || Multiplication || Division || mRemainder){
                    input_2 = Float.parseFloat(result.getText() + "");
                }

                if (Addition){
                    result.setText(String.format("%s", input_1 + input_2));
                    Addition = false;
                }

                if (Subtraction){
                    result.setText(String.format("%s", input_1 - input_2));
                    Subtraction = false;
                }

                if (Multiplication){
                    result.setText(String.format("%s", input_1 * input_2));
                    Multiplication = false;
                }

                if (Division){
                    result.setText(String.format("%s", input_1 / input_2));
                    Division = false;
                }

                if (mRemainder){
                    result.setText(String.format("%s", input_1 % input_2));
                    mRemainder = false;
                }
            }
        });

        button_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                input_1 = 0.0;
                input_2 = 0.0;
            }
        });

        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal){

                }else{
                    result.setText(result.getText() + ".");
                    decimal = true;
                }
            }
        });
    }
}
