package br.com.aline.modelo;

public class TotalizadorDeBonus {
    private double total = 0;

    public void adiciona(Funcionario f) {
        total += f.getBonus();
    }

    public double getTotal() {
        return this.total;
    }
}
