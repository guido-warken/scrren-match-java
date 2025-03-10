package br.com.guido.scrrenmatch.exceptions;

public class ErroDeConversaoException extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoException(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
} 