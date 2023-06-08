package com.example.individual_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et_num1);
        et2 = (EditText) findViewById(R.id.et_num2);
        tv1 = (TextView) findViewById(R.id.tv_resultado);

    }

    public void sumar(View view){
        String num_1_String = et1.getText().toString();
        String num_2_String = et2.getText().toString();

        int num_1_int = Integer.parseInt(num_1_String);
        int num_2_int = Integer.parseInt(num_2_String);

        int resultado = (num_1_int + num_2_int);

        String resultado_String = String.valueOf(resultado);

        tv1.setText(resultado_String);
    }

    public void restar(View view){
        String num_1_String = et1.getText().toString();
        String num_2_String = et2.getText().toString();

        int num_1_int = Integer.parseInt(num_1_String);
        int num_2_int = Integer.parseInt(num_2_String);

        int resultado = (num_1_int - num_2_int);

        String resultado_String = String.valueOf(resultado);

        tv1.setText(resultado_String);
    }

    public void multiplicar(View view){
        String num_1_String = et1.getText().toString();
        String num_2_String = et2.getText().toString();

        int num_1_int = Integer.parseInt(num_1_String);
        int num_2_int = Integer.parseInt(num_2_String);

        int resultado = (num_1_int * num_2_int);

        String resultado_String = String.valueOf(resultado);

        tv1.setText(resultado_String);
    }

    public void dividir(View view){
        String num_1_String = et1.getText().toString();
        String num_2_String = et2.getText().toString();

        int num_1_int = Integer.parseInt(num_1_String);
        int num_2_int = Integer.parseInt(num_2_String);

        int resultado = (num_1_int / num_2_int);

        String resultado_String = String.valueOf(resultado);

        tv1.setText(resultado_String);
    }

}