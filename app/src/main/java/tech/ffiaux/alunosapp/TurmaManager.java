package tech.ffiaux.alunosapp;

import java.util.ArrayList;
import java.util.List;

public class TurmaManager
{
    private static List<Aluno> alunos;
    private static Integer qtdAprovados = null;
    private static Integer qtdReprovados = null;
    private static Integer qtdRecuperacao = null;
    private static Double mediaTurma = null;

    public static List<Aluno> getAlunos()
    {
        if (alunos == null)
        {
            alunos = new ArrayList<Aluno>();
        }

        return alunos;
    }

    public static double getMediaTurma()
    {
        Double notas = 0.0;
        if (mediaTurma == null)
        {
            for(Aluno a : alunos)
            {
                notas += a.getNota();
            }

            mediaTurma = notas / alunos.size();
        }

        return mediaTurma;
    }

    public static int getQtdAprovados()
    {
        if (qtdAprovados == null)
        {
            checkSituacoesAlunos();
        }

        return qtdAprovados;
    }

    public static int getQtdReprovados()
    {
        if (qtdReprovados == null)
        {
            checkSituacoesAlunos();
        }

        return qtdReprovados;
    }

    public static int getQtdRecuperacao()
    {
        if (qtdRecuperacao == null)
        {
            checkSituacoesAlunos();
        }

        return qtdRecuperacao;
    }

    private static void checkSituacoesAlunos()
    {
        qtdAprovados = qtdReprovados = qtdRecuperacao = 0;
        for(Aluno a : alunos)
        {
            if (a.getSituacao().equals("Aprovado"))
            {
                qtdAprovados++;
            }
            else if (a.getSituacao().equals("Reprovado"))
            {
                qtdReprovados++;
            }
            else if (a.getSituacao().equals("Recuperacao"))
            {
                qtdRecuperacao++;
            }
        }
    }
}
