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
                "F1",
                "F2",
                "F3",
                "F4"
        };

        int i = new Random().nextInt(4);

        TextView texto = findViewById(R.id.fraseDoDia);
        texto.setText(frases[i]);

    }

}