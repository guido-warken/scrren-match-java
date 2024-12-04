package br.com.guido.scrrenmatch.modelo;

import br.com.guido.scrrenmatch.modelo.interfaces.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (getAvaliacaoMedia() / 2);
    }
}
