package br.com.anthonnymachado.projetoteste;

import android.support.v7.app.AppCompatActivity;
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

    public void sortearNumero(View view) {
        TextView texto = (TextView) findViewById(R.id.txtResult);

        int numero = new Random().nextInt(11);

        texto.setText("O número selecionado é: " + numero);
    }
}
