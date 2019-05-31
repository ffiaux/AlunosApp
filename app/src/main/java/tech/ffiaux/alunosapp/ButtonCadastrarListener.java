package tech.ffiaux.alunosapp;

import android.content.Intent;
import android.view.View;

public class ButtonCadastrarListener implements View.OnClickListener
{
    private MainActivity mainActivity;

    public ButtonCadastrarListener(MainActivity mainActivity)
    {
        System.out.println("ButtonCadastrarListener");
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v)
    {
        System.out.println("ButtonCadastrarListener.onClick");
        Intent intent = new Intent(this.mainActivity, CadastrarActivity.class);
        this.mainActivity.startActivity(intent);
    }
}
