package tech.ffiaux.alunosapp;

public class Aluno
{
    private String nome;
    private Double nota;

    public Aluno() {}

    public Aluno(String nome, Double nota)
    {
        this.nome = nome;
        this.nota = nota;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString()
    {
        return this.nome + " - " + this.nota + " - " + getSituacao();
    }

    public String getSituacao()
    {
        String situacao = null;
        if (this.nota >= 6.0)
        {
            situacao = "Aprovado";
        }
        else if (this.nota <= 4.9)
        {
            situacao = "Reprovado";
        }
        else
        {
            situacao = "Recuperacao";
        }

        return situacao;
    }
}
