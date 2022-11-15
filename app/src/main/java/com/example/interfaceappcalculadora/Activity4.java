package com.example.interfaceappcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    private TextView textViewResultado1;
    private TextView textViewFormula1;
    private EditText editTextConcentraçao;
    private EditText editTextPureza;
    private EditText editTextVolume;
    private Button buttonCalcular1;
    private EditText editTextMassaMolar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        textViewResultado1 = findViewById(R.id.textViewResultado1);
        textViewFormula1 = findViewById(R.id.textViewFormula1);
        editTextConcentraçao = findViewById(R.id.editTextConcentraçao);
        editTextPureza = findViewById(R.id.editTextPureza);
        editTextVolume = findViewById(R.id.editTextVolume);
        buttonCalcular1 = findViewById(R.id.buttonCalcular1);
        editTextMassaMolar = findViewById(R.id.editTextMassaMolar);

        buttonCalcular1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularMassa();
            }
        });
    }
    public void calcularMassa(){
        double valor1 = Double.parseDouble(editTextConcentraçao.getText().toString());
        double valor2 = Double.parseDouble(editTextVolume.getText().toString());
        double valor3 = Double.parseDouble(editTextPureza.getText().toString());
        double valor4 = Double.parseDouble(editTextMassaMolar.getText().toString());

        textViewResultado1.setText(String.valueOf("Resultado: " + (valor1*valor2*100*valor4)/(valor3)+"g"));
        textViewFormula1.setText("Formula: " + valor1 + "X" + valor2 + "X" + valor4 + "/" + valor3);


    }
}