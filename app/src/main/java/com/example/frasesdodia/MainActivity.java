package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "si vis pacem para bellum",
            "O sorriso enriquece aqueles que recebem sem empobrecer aqueles que os dão.",
            "A única forma de vencer uma discussão é evitá-la.",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void gerarFrase(View view){

        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(frases.length);
        String frase = frases[numeroAleatorio];

        texto.setText(frase);

    }

    public void exibirTodas(View view){

        TextView texto = findViewById(R.id.textResultado);
        String textoResultado = "";

        for(String frase: frases){
            textoResultado = textoResultado + frase + "\n";
        }

        texto.setText(textoResultado);

    }

}