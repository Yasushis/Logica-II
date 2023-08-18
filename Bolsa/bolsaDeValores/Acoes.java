package bolsaDeValores;

public class Acoes extends Investimento {

    public Acoes(String nome, String sigla, float valor, float dividendos) {
        super(nome, sigla, valor, dividendos);
    }

    public Acoes(String nome, String sigla, float valor) {
        super(nome, sigla, valor, 0);
    }
}
