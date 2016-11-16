package com.example.aluno.soma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SomaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);
        Button clickoBtn = (Button) findViewById(R.id.Btnsomar);
        clickoBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override

            public boolean onLongClick(View view) {
                EditText editTextprimeiro_numero = (EditText) findViewById(R.id.primeiro_numero);
                EditText editTextsegundo_numero = (EditText) findViewById(R.id.segundo_numero);

                String n1 = editTextprimeiro_numero.getText().toString();
                String n2 = editTextsegundo_numero.getText().toString();


                int p_1 = Integer.parseInt(n1);
                int p_2 = Integer.parseInt(n2);

                int resultado = p_1 / p_2;

                Toast.makeText(getBaseContext(), "A divisão é " + resultado, Toast.LENGTH_LONG).show();

                return true;
            }
        });
        clickoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pegar o componente
                EditText editTextprimeiro_numero = (EditText) findViewById(R.id.primeiro_numero);
                EditText editTextsegundo_numero = (EditText)findViewById(R.id.segundo_numero);

                //Pegar o valor do componente
                String n1 = editTextprimeiro_numero.getText().toString();
                String n2 = editTextsegundo_numero.getText().toString();

                //Converter o valor do componente em int
                int p_1 = Integer.parseInt(n1);
                int p_2 = Integer.parseInt(n2);

                //Somar
                int resultado = p_1 + p_2;



                //Mostrar o resultado ao usuário
                Toast.makeText(getBaseContext(), "A soma é " + resultado,Toast.LENGTH_LONG).show();

            }
        });
    }


   }


