package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Medico> medicos = new ArrayList<>();

    public void contratar(String nome, String nomeRegiao, String cidade) {
        Regiao regiao = RegiaoFactory.getRegiao(nomeRegiao, cidade);
        Medico medico = new Medico(nome, regiao);
        medicos.add(medico);
    }

    public List<String> obterMedicos() {
        List<String> listaMedicos = new ArrayList<String>();
        for (Medico medico : this.medicos) {
            listaMedicos.add(medico.getNome());
        }

        return listaMedicos;
    }
}