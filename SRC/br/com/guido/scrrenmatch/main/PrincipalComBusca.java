package br.com.guido.scrrenmatch.main;

import br.com.guido.scrrenmatch.service.IServicoDeBuscaDeFilmes;
import br.com.guido.scrrenmatch.service.ServicoDeBuscaDeFilmes;
import br.com.guido.scrrenmatch.storage.IServicoDeArmazenamentoDeFilmes;
import br.com.guido.scrrenmatch.storage.ServicoDeArmazenamentoDeFilmes;
import br.com.guido.scrrenmatch.modelo.Titulo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);
        String query;
        ArrayList<Titulo> titulos = new ArrayList<>();
        IServicoDeBuscaDeFilmes servicoDeBuscaDeFilmes = new ServicoDeBuscaDeFilmes();
        IServicoDeArmazenamentoDeFilmes servicoDeArmazenamentoDeFilmes = new ServicoDeArmazenamentoDeFilmes();

        do {
            System.out.println("Qual filme você gostaria de pesquisar? (Digite 'sair' para encerrar)");
            query = leitor.nextLine();

            if (!query.equalsIgnoreCase("sair")) {
                try {
                    Titulo meuTitulo = servicoDeBuscaDeFilmes.buscarFilme(query);
                    System.out.println(meuTitulo);
                    titulos.add(meuTitulo);
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        } while (!query.equalsIgnoreCase("sair"));
        leitor.close();

        // Write the list of titles to a JSON file
        try {
            servicoDeArmazenamentoDeFilmes.salvarFilmes(titulos);
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
