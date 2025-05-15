package br.senac.sp.l13.appheroephpmysql;

public class Vagas {

    private String nome;

    private String descricao;

    private double salario;

    private String cargaHoraria;

    private String locaç;

    private String regime;

    public Vagas(String nome, String descricao, double salario, String cargaHoraria, String locaç, String regime) {
        this.nome = nome;
        this.descricao = descricao;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.locaç = locaç;
        this.regime = regime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getLocaç() {
        return locaç;
    }

    public void setLocaç(String locaç) {
        this.locaç = locaç;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }
}
