package br.com.guido.scrrenmatch.calculos;

import br.com.guido.scrrenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public void inclui(Titulo tit) {
        tempoTotal += tit.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
