package br.com.guido.scrrenmatch.main;

import br.com.guido.scrrenmatch.modelo.Titulo;
import br.com.guido.scrrenmatch.modelo.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual filme você gostaria de pesquisar?");
        var query = leitor.nextLine();

        String baseUrl = "http://www.omdbapi.com/";

        String apiKey = "9aeaec9e";

        String uriString = String.format("%s?t=%s&apikey=%s", baseUrl, query, apiKey);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uriString)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        String jsonString = response.body();

        TituloOmdb tituloOmdb = gson.fromJson(jsonString, TituloOmdb.class);
        try {
            Titulo meuTitulo = new Titulo(tituloOmdb);
            System.out.println(meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: " + e.getMessage());
        } finally {
            leitor.close();
        }
    }
}
