package br.com.guido.scrrenmatch.modelo;

import br.com.guido.scrrenmatch.modelo.interfaces.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private int totalVisualizacoes;
    private String nome;
    private Serie serie;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public void setNome(String nome) {
        this.nome = nome;
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