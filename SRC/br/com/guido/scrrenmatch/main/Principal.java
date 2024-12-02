package br.com.guido.scrrenmatch.main;

import br.com.guido.scrrenmatch.calculos.CalculadoraDeTempo;
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

        Filme outroFilme = new Filme();

        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(100);
        outroFilme.setNome("Avatar");
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.setDiretor("James Cameron");

        outroFilme.avalia(9.5);
        outroFilme.avalia(9);
        outroFilme.avalia(10);

        outroFilme.exibeFichaTecnica();

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

CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

calculadora.inclui(meuFilme);
calculadora.inclui(outroFilme);
calculadora.inclui(lost);

        System.out.println("tempo total para maratonar: " + calculadora.getTempoTotal());
    }
}
