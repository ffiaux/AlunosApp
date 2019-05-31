package tech.ffiaux.alunosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCadastrar = findViewById(R.id.buttonCadastrar);
        buttonCadastrar.setOnClickListener(new ButtonCadastrarListener(this));

        Button buttonListar = findViewById(R.id.buttonListar);
        buttonListar.setOnClickListener(new ButtonListarListener(this));

        Button buttonRelatorio = findViewById(R.id.buttonRelatorio);
        buttonRelatorio.setOnClickListener(new ButtonRelatorioListener(this));
    }
}
