package br.com.guido.scrrenmatch.modelo;

import br.com.guido.scrrenmatch.modelo.interfaces.Classificavel;

public class Episodio extends Titulo implements Classificavel {
    private int numero;
    private int totalVisualizacoes;
    private String nome;
    private Serie serie;

    public Episodio(String nome, int anoDeLancamento, boolean incluidoNoPlano, int duracaoEmMinutos) {
        super(nome, anoDeLancamento, incluidoNoPlano, duracaoEmMinutos);
    }

    public int getNumero() {
        return numero;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public String getNome() {
        return nome;
    }


    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes >= 100) {
            return 4;
        }
        return 2;
    }
}
