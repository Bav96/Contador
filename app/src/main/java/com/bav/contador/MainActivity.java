package com.bav.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private int valorContador;
    private TextView contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valorContador = 0;
        // recuperamos el texto en el que escribiremos el valor
        contador = findViewById(R.id.contador);

        // 1. buscamos el elemento al que escucha el evento (donde aplicaremos el listener)
        // y llamamos al metodo que incrementa
        findViewById(R.id.incrementar).setOnClickListener(view -> {
            incrementar();
        });
        // 1. buscamos el elemento al que escucha el evento (donde aplicaremos el listener)
        // y llamamos al metodo que decrementa
        findViewById(R.id.decrementar).setOnClickListener(view -> {
            decrementar();

        });
        // 1. buscamos el elemento al que escucha el evento (donde aplicaremos el listener)
        // y llamamos al metodo que resetea
        findViewById(R.id.resetear).setOnClickListener(view -> {
            resetear();

        });
    }
    private void incrementar() {
        valorContador ++;
        //Pinta el valor del contador por pantalla.
        contador.setText(Integer.toString(valorContador));
    }
    private void decrementar() {
        valorContador --;
        //Pinta el valor del contador por pantalla.
        contador.setText(Integer.toString(valorContador));
    }
    private void resetear() {
        valorContador=0;
        //Pinta el valor del contador por pantalla.
        contador.setText(Integer.toString(valorContador));
    }
}
