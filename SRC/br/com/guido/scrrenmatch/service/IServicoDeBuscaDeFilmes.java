package br.com.guido.scrrenmatch.service;

import br.com.guido.scrrenmatch.modelo.Titulo;

/**
 * Interface para o serviço de busca de filmes.
 * Define o contrato para buscar informações de filmes a partir de uma consulta.
 */
public interface IServicoDeBuscaDeFilmes {
    /**
     * Busca informações de um filme com base na consulta fornecida.
     *
     * @param query a consulta do filme a ser buscado.
     * @return um objeto Titulo contendo as informações do filme.
     * @throws Exception se ocorrer um erro durante a busca do filme.
     */
    Titulo buscarFilme(String query) throws Exception;
} 