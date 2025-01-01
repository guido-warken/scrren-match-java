package br.com.guido.scrrenmatch.modelo;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somadasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento, boolean incluidoNoPlano, int duracaoEmMinutos) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Lançado em: " + anoDeLancamento);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Avaliação média: %.2f".formatted(getAvaliacaoMedia()));
    }

    public void avalia(double nota) {
        somadasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double getAvaliacaoMedia() {
        return somadasAvaliacoes / totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public int compareTo(Titulo outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return String.format("Nome do título: %s, ano de lançamento: %d", nome, anoDeLancamento);
    }
}
