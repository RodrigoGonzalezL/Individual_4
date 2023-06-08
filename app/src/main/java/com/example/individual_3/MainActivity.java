package com.example.individual_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et_num1);
        et2 = (EditText) findViewById(R.id.et_num2);
        tv1 = (TextView) findViewById(R.id.tv_resultado);

        button = (Button) findViewById(R.id.button_exit);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        }));

    }

    public void sumar(View view){
        String num_1_String = et1.getText().toString();
        String num_2_String = et2.getText().toString();

        if (!(num_1_String.isEmpty()) & !(num_2_String.isEmpty())) {

            int num_1_int = Integer.parseInt(num_1_String);
            int num_2_int = Integer.parseInt(num_2_String);

            int resultado = (num_1_int + num_2_int);

            String resultado_String = String.valueOf(resultado);

            tv1.setText(resultado_String);

        }else {
            Toast.makeText(this, "Ingrese ambos números", Toast.LENGTH_LONG).show();
        }
    }

    public void restar(View view){
        String num_1_String = et1.getText().toString();
        String num_2_String = et2.getText().toString();

        if (!(num_1_String.isEmpty()) & !(num_2_String.isEmpty())) {

            int num_1_int = Integer.parseInt(num_1_String);
            int num_2_int = Integer.parseInt(num_2_String);

            int resultado = (num_1_int - num_2_int);

            String resultado_String = String.valueOf(resultado);

            tv1.setText(resultado_String);

        }else {
            Toast.makeText(this, "Ingrese ambos números", Toast.LENGTH_LONG).show();
        }
    }

    public void multiplicar(View view){
        String num_1_String = et1.getText().toString();
        String num_2_String = et2.getText().toString();

        if (!(num_1_String.isEmpty()) & !(num_2_String.isEmpty())) {

            int num_1_int = Integer.parseInt(num_1_String);
            int num_2_int = Integer.parseInt(num_2_String);

            int resultado = (num_1_int * num_2_int);

            String resultado_String = String.valueOf(resultado);

            tv1.setText(resultado_String);

        }else {
            Toast.makeText(this, "Ingrese ambos números", Toast.LENGTH_LONG).show();
        }
    }

    public void dividir(View view){

        String num_1_String = et1.getText().toString();
        String num_2_String = et2.getText().toString();

        if (!(num_1_String.isEmpty()) & !(num_2_String.isEmpty())) {

            int num_1_int = Integer.parseInt(num_1_String);
            int num_2_int = Integer.parseInt(num_2_String);

            int resultado = (num_1_int / num_2_int);

            String resultado_String = String.valueOf(resultado);

            tv1.setText(resultado_String);

        }else {
            Toast.makeText(this, "Ingrese ambos números", Toast.LENGTH_LONG).show();
        }

    }

}