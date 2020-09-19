package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = (Button) findViewById(R.id.button1);
        final TextView txt1 = (TextView) findViewById(R.id.textView);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "1");
            }
        });

        Button two = (Button) findViewById(R.id.button2);
        final TextView txt2 = (TextView) findViewById(R.id.textView);

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText(txt2.getText() + "2");
            }
        });

        Button three = (Button) findViewById(R.id.button3);
        final TextView txt3 = (TextView) findViewById(R.id.textView);

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt3.setText(txt3.getText() + "3");
            }
        });

        Button add = (Button) findViewById(R.id.button4);
        final TextView txtadd = (TextView) findViewById(R.id.textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtadd.setText(txtadd.getText() + "+");
            }
        });

        Button four = (Button) findViewById(R.id.button5);
        final TextView txt4 = (TextView) findViewById(R.id.textView);

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt4.setText(txt4.getText() + "4");
            }
        });

        Button five = (Button) findViewById(R.id.button6);
        final TextView txt5 = (TextView) findViewById(R.id.textView);

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt5.setText(txt5.getText() + "5");
            }
        });

        Button six = (Button) findViewById(R.id.button7);
        final TextView txt6 = (TextView) findViewById(R.id.textView);

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt6.setText(txt6.getText() + "6");
            }
        });

        Button subtraction = (Button) findViewById(R.id.button8);
        final TextView txtsubtraction = (TextView) findViewById(R.id.textView);

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtsubtraction.setText(txtsubtraction.getText() + "-");
            }
        });

        Button seven = (Button) findViewById(R.id.button9);
        final TextView txt7 = (TextView) findViewById(R.id.textView);

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt7.setText(txt7.getText() + "7");
            }
        });

        Button eight = (Button) findViewById(R.id.button10);
        final TextView txt8 = (TextView) findViewById(R.id.textView);

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt8.setText(txt8.getText() + "8");
            }
        });

        Button nine = (Button) findViewById(R.id.button11);
        final TextView txt9 = (TextView) findViewById(R.id.textView);

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt9.setText(txt9.getText() + "9");
            }
        });

        Button multiplication = (Button) findViewById(R.id.button12);
        final TextView txtmultiplication = (TextView) findViewById(R.id.textView);

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmultiplication.setText(txtmultiplication.getText() + "×");
            }
        });

        Button decimalpoint = (Button) findViewById(R.id.button13);
        final TextView txtdecimalpoint = (TextView) findViewById(R.id.textView);

        decimalpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtdecimalpoint.setText(txtdecimalpoint.getText() + ".");
            }
        });

        Button zero = (Button) findViewById(R.id.button14);
        final TextView txt0 = (TextView) findViewById(R.id.textView);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt0.setText(txt0.getText() + "0");
            }
        });

//        Button equal = (Button) findViewById(R.id.button15);     
//        final TextView txtequal = (TextView) findViewById(R.id.textView);
//
//        equal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                txtequal.setText(txtequal.getText() + "=" + eval(txtequal));
//            }
//        });

        Button division = (Button) findViewById(R.id.button16);
        final TextView txtdivision = (TextView) findViewById(R.id.textView);

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtdivision.setText(txtdivision.getText() + "÷");
            }
        });

        Button C = (Button) findViewById(R.id.button17);
        final TextView txtC = (TextView) findViewById(R.id.textView);

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtC.setText("");
            }
        });
    }
}


