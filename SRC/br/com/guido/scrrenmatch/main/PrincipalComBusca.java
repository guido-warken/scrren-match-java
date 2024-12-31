package br.com.guido.scrrenmatch.main;

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
        System.out.println(response.body());
        leitor.close();
    }
}
