package br.com.guido.scrrenmatch.main;

import br.com.guido.scrrenmatch.modelo.Titulo;
import com.google.gson.Gson;

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

        Gson gson = new Gson();

        String jsonString = response.body();

        Titulo meuTitulo = gson.fromJson(jsonString, Titulo.class);
        System.out.println(meuTitulo);
        leitor.close();
    }
}
