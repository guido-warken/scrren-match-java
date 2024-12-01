package br.com.guido.scrrenmatch.main;

import br.com.guido.scrrenmatch.modelo.Filme;
import br.com.guido.scrrenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setNome("Poderoso Chefão");
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDiretor("Francis Ford Coppola");

        meuFilme.avalia(9.5);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(9.5);

        meuFilme.exibeFichaTecnica();

        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setIncluidoNoPlano(true);
        lost.setEpisodiosPorTemporada(20);
        lost.setAtiva(false);
        lost.setTemporadas(6);
        lost.setMinutosPorEpisodio(42);

        lost.avalia(9.5);
        lost.avalia(9.5);
        lost.avalia(10);

        lost.exibeFichaTecnica();
    }
}
