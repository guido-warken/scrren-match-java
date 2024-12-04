package br.com.guido.scrrenmatch.modelo;

import br.com.guido.scrrenmatch.modelo.interfaces.Classificavel;

public class FiltroRecomendacoes {
    public void filtra(Classificavel titulo) {
        int valorClassificacao = titulo.getClassificacao();

        if (valorClassificacao >= 4) {
            System.out.println("Está entre os favoritos do público");
        } else if (valorClassificacao >= 3) {
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Título para assistir depois");
        }
    }

}
