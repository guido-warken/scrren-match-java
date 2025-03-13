package br.com.guido.scrrenmatch.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.guido.scrrenmatch.modelo.Titulo;
import br.com.guido.scrrenmatch.modelo.TituloOmdb;

/**
 * Implementação do serviço de busca de filmes usando a API OMDB.
 */
public class ServicoDeBuscaDeFilmes implements IServicoDeBuscaDeFilmes {
    private static final String BASE_URL = "http://www.omdbapi.com/";
    private static final String API_KEY = "9aeaec9e";
    private final Gson gson;

    /**
     * Construtor que inicializa o Gson com a política de nomenclatura de campos.
     */
    public ServicoDeBuscaDeFilmes() {
        this.gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .create();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Titulo buscarFilme(String query) throws Exception {
        String uriString = String.format("%s?t=%s&apikey=%s", BASE_URL, query, API_KEY);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uriString)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String jsonString = response.body();
        TituloOmdb tituloOmdb = gson.fromJson(jsonString, TituloOmdb.class);
        return new Titulo(tituloOmdb);
    }
} 