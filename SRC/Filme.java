class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somadasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Lançado em: " + anoDeLancamento);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Avaliação média: %.2f".formatted(calculaMedia()));
    }

    void avalia(double nota) {
        somadasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double calculaMedia() {
        return somadasAvaliacoes / totalDeAvaliacoes;
    }
}
