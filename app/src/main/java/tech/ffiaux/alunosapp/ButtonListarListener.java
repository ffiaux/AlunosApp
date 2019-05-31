package tech.ffiaux.alunosapp;

import android.content.Intent;
import android.view.View;

public class ButtonListarListener implements View.OnClickListener
{
    private MainActivity mainActivity;

    public ButtonListarListener(MainActivity mainActivity)
    {
        System.out.println("ButtonListarListener");
        this.mainActivity = mainActivity;

        for(Aluno a : TurmaManager.getAlunos())
        {
            System.out.println(a.getNome());
            System.out.println(a.getNota());
        }
    }

    @Override
    public void onClick(View v)
    {
        System.out.println("ButtonListarListener.onClick");
        Intent intent = new Intent(this.mainActivity, ListarActivity.class);
        this.mainActivity.startActivity(intent);
    }
}
