package br.com.guido.scrrenmatch.main;

import br.com.guido.scrrenmatch.modelo.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setNome("Poderoso Chefão");
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.avalia(9.5);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(9.5);

        meuFilme.exibeFichaTecnica();
    }
}
