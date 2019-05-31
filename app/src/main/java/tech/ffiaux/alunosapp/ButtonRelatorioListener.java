package tech.ffiaux.alunosapp;

import android.content.Intent;
import android.view.View;

public class ButtonRelatorioListener implements View.OnClickListener
{
    private MainActivity mainActivity;

    public ButtonRelatorioListener(MainActivity mainActivity)
    {
        this.mainActivity = mainActivity;
        System.out.println("ButtonRelatorioListener");
    }

    @Override
    public void onClick(View v)
    {
        System.out.println("ButtonRelatorioListener.onClick");
        Intent intent = new Intent(this.mainActivity, RelatorioActivity.class);
        this.mainActivity.startActivity(intent);
    }
}
