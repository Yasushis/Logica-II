package bolsaDeValores;

import java.util.ArrayList;

public class Investidor {

    private String nome;
    private ArrayList<Investimento> investimentos;
    private float dinheiro;

    public Investidor(String nome, float dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.investimentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Investimento> getInvestimentos() {
        return investimentos;
    }

    public void setInvestimentos(ArrayList<Investimento> investimentos) {
        this.investimentos = investimentos;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void comprar (Investimento investimento, int quantidade) {
        if (dinheiro >= investimento.getValor() * quantidade) {
            dinheiro -= investimento.getValor() * quantidade;
            for (int i = 0; i < quantidade; i++) {
                investimentos.add(investimento);
            }
        }
    }

    public void vender (Investimento investimento, int quantidade) {

        int mandioca = 0;
        for (int i = 0; i < investimentos.size(); i++) {
            if (investimentos.get(i) == investimento)
                mandioca++;
            if (mandioca == quantidade)
                break;
        }

        if (mandioca < quantidade) {

        }

        if (mandioca == quantidade) {

        }
    }
}
