package com.example.panuchi007.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.InputType;


public class Activity2 extends AppCompatActivity {
    TextView currency1;
    TextView currency2;
    Button changecurrencybutton;
    Button convertcurrency;
    float a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        currency1 = (TextView) findViewById(R.id.currency1);
        currency2 = (TextView) findViewById(R.id.currency2);
        changecurrencybutton = (Button) findViewById(R.id.changecurrencybutton);
         convertcurrency = (Button)findViewById(R.id.convertbutton);


        changecurrencybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        convertcurrency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert1();
            }
        });
    }


    void convert1()
    {  EditText etcurrency1= (EditText) findViewById(R.id.etcurrency1);
        etcurrency1.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText  etcurrency2=(EditText) findViewById(R.id.etcurrency2);
        etcurrency2.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(etcurrency1.getText().toString());
        double result=a*1.14;
        etcurrency2.setText(String.valueOf(result));

    }

    void convert2()
    {  EditText usd= (EditText) findViewById(R.id.etcurrency1);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  bdt=(EditText) findViewById(R.id.etcurrency2);
        bdt.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(bdt.getText().toString());
        double result=a/1.14;
        usd.setText(String.valueOf(result));
    }


    public void openMainActivity() {
        Intent intent = new Intent( Activity2.this, MainActivity.class);
        startActivity(intent);
    }
    }

