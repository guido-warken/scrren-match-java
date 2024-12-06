package br.com.guido.scrrenmatch.main;

import br.com.guido.scrrenmatch.calculos.CalculadoraDeTempo;
import br.com.guido.scrrenmatch.modelo.Episodio;
import br.com.guido.scrrenmatch.modelo.Filme;
import br.com.guido.scrrenmatch.modelo.FiltroRecomendacoes;
import br.com.guido.scrrenmatch.modelo.Serie;

import java.util.ArrayList;

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

        var terceiroFilme = new Filme();

        terceiroFilme.setAnoDeLancamento(2003);
        terceiroFilme.setDuracaoEmMinutos(200);
        terceiroFilme.setNome("Dogville");
        terceiroFilme.setIncluidoNoPlano(true);

        terceiroFilme.avalia(9.5);
        terceiroFilme.avalia(9);
        terceiroFilme.avalia(10);

        ArrayList<Filme> filmes = new ArrayList<>();

        filmes.add(meuFilme);
        filmes.add(outroFilme);
        filmes.add(terceiroFilme);

        System.out.println(filmes.get(0).getNome());

        System.out.println(filmes);
    }
}
