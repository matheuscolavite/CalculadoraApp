package com.example.interfaceappcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    private EditText editTextC1;
    private EditText editTextC2;
    private EditText editTextV2;
    private Button buttonCalcular;
    private TextView textViewResultado;
    private TextView textViewFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        double valor1,valor2,valor3;

        textViewFormula = findViewById(R.id.textViewFormula);
        textViewResultado = findViewById(R.id.textViewResultado);
        editTextC1 = findViewById(R.id.editTextC1);
        editTextC2 = findViewById(R.id.editTextC2);
        editTextV2 = findViewById(R.id.editTextV2);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularVolume();
            }
        });

    }
    public void calcularVolume(){
        double valor1 = Double.parseDouble(editTextC1.getText().toString());
        double valor2 = Double.parseDouble(editTextC2.getText().toString());
        double valor3 = Double.parseDouble(editTextV2.getText().toString());

        textViewResultado.setText(String.valueOf(valor3*valor2/valor1 + "mL"));
        textViewFormula.setText(String.valueOf("Operação = ("+ valor3+" X "+valor2+ ") / " + valor1 + " mL"));

    }
}