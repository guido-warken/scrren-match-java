package br.com.guido.scrrenmatch.storage;

import br.com.guido.scrrenmatch.modelo.Titulo;
import java.io.IOException;
import java.util.List;

/**
 * Interface para o serviço de armazenamento de filmes.
 * Define o contrato para salvar informações de filmes em um arquivo.
 */
public interface IServicoDeArmazenamentoDeFilmes {
    /**
     * Salva uma lista de filmes em um arquivo JSON.
     *
     * @param titulos a lista de títulos a ser salva.
     * @throws IOException se ocorrer um erro durante a escrita no arquivo.
     */
    void salvarFilmes(List<Titulo> titulos) throws IOException;
} 