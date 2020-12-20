package com.example.drawerassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CalculatorMainActivity extends AppCompatActivity {

    private TextView exp, result;
    private Button zero, one, two, three, four, five, six, seven, eight, nine;
    private Button dec, clear, equ, back;
    private Button add, sub, mul, div;
    private boolean addition, subtraction, multiplication, division;
    private double val1 = 0, val2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main);
        assign_buttons();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText("");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText() + "9");
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText() + ".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exp == null){
                    exp.setText("");
                }
                else {
                    val1 = Double.parseDouble(exp.getText() + "");
                    addition = true;
                    exp.setText("");
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exp == null){
                    exp.setText("");
                }
                else {
                    val1 = Double.parseDouble(exp.getText() + "");
                    subtraction = true;
                    exp.setText("");
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exp == null){
                    exp.setText("");
                }
                else {
                    val1 = Double.parseDouble(exp.getText() + "");
                    multiplication = true;
                    exp.setText("");
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exp == null || Double.parseDouble(String.valueOf(exp.getText())) == 0){
                    exp.setText("");
                }
                else {
                    val1 = Double.parseDouble(exp.getText() + "");
                    division = true;
                    exp.setText("");
                }
            }
        });


        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!addition && !subtraction && !multiplication && !division){
                    result.setText(exp.getText());
                    exp.setText("");
                }
                if (addition){
                    Double res = val1 + Double.parseDouble((String) exp.getText());
                    result.setText(res.toString());
                    addition = false;
                    exp.setText("");
                }
                if (multiplication){
                    Double res = val1 * Double.parseDouble((String) exp.getText());
                    result.setText(res.toString());
                    multiplication = false;
                    exp.setText("");
                }
                if (subtraction){
                    Double res = val1 - Double.parseDouble((String) exp.getText());
                    result.setText(res.toString());
                    subtraction = false;
                    exp.setText("");
                }
                if (division){
                    Double res = val1 / Double.parseDouble((String) exp.getText());
                    result.setText(res.toString());
                    division = false;
                    exp.setText("");
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                exp.setText("");
            }
        });

    }


    private void assign_buttons(){
        zero = (Button)findViewById(R.id.btn0);
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        dec = (Button)findViewById(R.id.btndec);
        add = (Button)findViewById(R.id.btnadd);
        sub = (Button)findViewById(R.id.btnsub);
        mul = (Button)findViewById(R.id.btnmul);
        div = (Button)findViewById(R.id.btndiv);
        equ = (Button)findViewById(R.id.btnequ);
        clear = (Button)findViewById(R.id.btnclear);
        back = (Button)findViewById(R.id.btnremove);
        exp = (TextView)findViewById(R.id.tvexp);
        result = (TextView)findViewById(R.id.tvresult);
    }





}