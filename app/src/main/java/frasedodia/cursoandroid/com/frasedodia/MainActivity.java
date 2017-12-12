package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textonovafrase;
    private Button botaonovafrase;

    private String[]  frase = {

            "1 2 3 4 Pé na bunda e mão no saco" ,
            "4 3 2 1 Abaixa a calça e souta um pum " ,
            "Toma limonada para cagar de madrugada" ,
            "Pega no meu saco se não te mato" ,
            "Quero cagar mas não posso" ,
            "Boi Boi Boi... boi da cara preta , pega esse menino que tem medo de careta" ,
            "Vai com bumbum tam tam" ,
            "Vem com bumbum tam tam tam" ,
            "O Karl vai morrrer" ,
            "Dorme nenem que a cuca vai pegar"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textonovafrase = (TextView) findViewById(R.id.textofrasedodiaid);
        botaonovafrase = (Button) findViewById(R.id.botaofrasedodiaid);

        botaonovafrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt( frase.length);

                textonovafrase.setText(frase[numeroAleatorio]);

            }
        });

    }
}
