package org.example;

public class Medico {
    private String nome;
    private Regiao regiaoLocalizada;

    public Medico(String nome, Regiao regiaoLocalizada) {
        this.nome = nome;
        this.regiaoLocalizada = regiaoLocalizada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String obterMedicos() {
        return this.getNome();
    }
}
