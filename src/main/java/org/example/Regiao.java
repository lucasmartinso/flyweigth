package org.example;

public class Regiao {

    private String nome;
    private String cidade;

    public Regiao(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return cidade;
    }
}