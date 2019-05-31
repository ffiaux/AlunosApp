package tech.ffiaux.alunosapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastrarActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        Button button = findViewById(R.id.buttonConfirmar);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editTextNome = findViewById(R.id.editTextNome);
        EditText editTextNota = findViewById(R.id.editTextNota);

        Double dNota = Double.parseDouble(editTextNota.getText().toString());
        Aluno aluno = new Aluno(editTextNome.getText().toString(), dNota);

        TurmaManager.getAlunos().add(aluno);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
