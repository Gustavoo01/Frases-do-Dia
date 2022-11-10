package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {
        String[] frases = {
                "Não há fatos eternos, como não há verdades absolutas.",
                "Aplica-te a todo o instante com toda a atenção... para terminar o trabalho que tens nas tuas mãos... e liberta-te de todas as outras preocupações. Delas ficarás livre se executares cada ação da tua vida como se fosse a última.",
                "As convicções são inimigas mais perigosas da verdade do que as mentiras.",
                "Se te ocorrer, de manhã, de acordares com preguiça e indolência, lembra-te deste pensamento: Levanto-me para retomar a minha obra de homem.",
                "Escava dentro de ti. É lá que está a fonte do bem, e esta pode jorrar continuamente, se a escavares sempre.",
                "Nada de desgosto, nem de desânimo; se acabas de fracassar, recomeça.",
                "Se você está sofrendo por coisas externas, não são elas que estão te perturbando, mas o seu próprio julgamento sobre elas. E está em seu poder anular este julgamento agora.",
                "De todos os animais selvagens, o homem jovem é o mais difícil de domar.",
                "Tente mover o mundo – o primeiro passo será mover a si mesmo."
        };

        int resultado = new Random().nextInt(9);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[resultado]);
    }

}