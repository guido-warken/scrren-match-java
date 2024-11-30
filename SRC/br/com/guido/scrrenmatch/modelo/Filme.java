package br.com.guido.scrrenmatch.modelo;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somadasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

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

    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
