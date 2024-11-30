import br.com.guido.scrrenmatch.modelo.Filme;

class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.nome = "Poderoso Chefão";
        meuFilme.incluidoNoPlano = true;

        meuFilme.avalia(9.5);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(9.5);

        meuFilme.exibeFichaTecnica();
    }
}
