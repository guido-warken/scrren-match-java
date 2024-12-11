package br.com.guido.scrrenmatch.main;

import br.com.guido.scrrenmatch.modelo.Filme;

import java.util.ArrayList;

public class Principal {
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

        ArrayList<Filme> filmes = new ArrayList<>();

        filmes.add(meuFilme);
        filmes.add(outroFilme);
        filmes.add(terceiroFilme);

        System.out.println(filmes.get(0).getNome());

        System.out.println(filmes);
    }
}
