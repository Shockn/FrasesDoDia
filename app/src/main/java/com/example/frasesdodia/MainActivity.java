package com.example.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarNovaFrase(View view){

        String [] frases = {
                "A natureza não dá saltos.",
                "Nem todas as tempestades vêm para atrapalhar a sua vida. Algumas vêm para limpar seu caminho.",
                "A persistência realiza o impossível.",
                "Não se desespere quando a caminhada estiver difícil, é sinal de que você está no caminho certo."
        };

        int i = new Random().nextInt(4);

        TextView texto = findViewById(R.id.fraseDoDia);
        texto.setText(frases[i]);

    }

}