package br.com.guido.scrrenmatch.storage;

import br.com.guido.scrrenmatch.modelo.Titulo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ServicoDeArmazenamentoDeFilmes implements IServicoDeArmazenamentoDeFilmes {
    private static final String FILE_NAME = "filmes.json";
    private final Gson gson;

    public ServicoDeArmazenamentoDeFilmes() {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    @Override
    public void salvarFilmes(List<Titulo> titulos) throws IOException {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            gson.toJson(titulos, writer);
        }
    }
} 