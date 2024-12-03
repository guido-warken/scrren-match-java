package br.com.guido.scrrenmatch.modelo;

import br.com.guido.scrrenmatch.modelo.interfaces.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;

    @Override
    public int getClassificacao() {
        return 0;
    }
}
