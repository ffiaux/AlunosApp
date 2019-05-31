package tech.ffiaux.alunosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RelatorioActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);

        ListView relatorio = (ListView) findViewById(R.id.relatorio);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getRelatorio());
        relatorio.setAdapter(adapter);
    }

    private List<String> getRelatorio()
    {
        List<String> relatorio = new ArrayList<String>();
        relatorio.add("Alunos: " + TurmaManager.getAlunos().size());
        relatorio.add("Aprovados: " + TurmaManager.getQtdAprovados());
        relatorio.add("Reprovados: " + TurmaManager.getQtdReprovados());
        relatorio.add("Recuperacao: " + TurmaManager.getQtdRecuperacao());
        relatorio.add("Media turma: " + TurmaManager.getMediaTurma());

        return relatorio;
    }
}
