package org.example;

import java.util.HashMap;
import java.util.Map;

public class RegiaoFactory {
    private static Map<String, Regiao> regioes = new HashMap<>();

    public static Regiao getRegiao(String nome, String cidade) {
        Regiao regiao = regioes.get(nome);
        if (regiao == null) {
            regiao = new Regiao(nome, cidade);
            regioes.put(nome, regiao);
        }
        return regiao;
    }

    public static int getTotalRegioes() {
        return regioes.size();
    }

}