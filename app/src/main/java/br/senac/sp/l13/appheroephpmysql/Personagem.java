package br.senac.sp.l13.appheroephpmysql;

public class Personagem {

    private String nome;
    private int classificacao;

    public Personagem(String nome, int classificacao) {
        this.nome = nome;
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}
