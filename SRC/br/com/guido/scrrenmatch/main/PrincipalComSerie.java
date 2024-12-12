package br.com.guido.scrrenmatch.main;

import br.com.guido.scrrenmatch.modelo.Filme;
import br.com.guido.scrrenmatch.modelo.Serie;
import br.com.guido.scrrenmatch.modelo.Titulo;

import java.util.ArrayList;

public class PrincipalComSerie {
 public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso Chefão", 1970, true, 180, "Francis Ford Coppola");

        meuFilme.avalia(9.5);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

     Filme outroFilme = new Filme("Avatar", 2023, true, 100, "James Cameron");

        outroFilme.avalia(9.5);
        outroFilme.avalia(9);
        outroFilme.avalia(10);

        var terceiroFilme = new Filme("Dogville", 2003, true, 200, "João da Silva");

        terceiroFilme.avalia(9.5);
        terceiroFilme.avalia(9);
        terceiroFilme.avalia(10);

     Serie breakingBad = new Serie("Breaking Bad", 2008, true, 0);

     breakingBad.setTemporadas(5);
     breakingBad.setEpisodiosPorTemporada(13); // Em média
     breakingBad.setMinutosPorEpisodio(47);    // Em média
     breakingBad.setAtiva(false);

        ArrayList<Titulo> titulos = new ArrayList<>();

        titulos.add(meuFilme);
        titulos.add(outroFilme);
        titulos.add(terceiroFilme);
        titulos.add(breakingBad);

        titulos.forEach(titulo -> {
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação do filme: " + filme.getClassificacao());
            }
        });
    }
}
