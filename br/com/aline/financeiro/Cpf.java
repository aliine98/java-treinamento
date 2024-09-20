package br.com.aline.financeiro;

public class Cpf implements Documento {
    private String valor;

    public Cpf(String valor) {
        this.valor = valor;
    }

    @Override
    public String getValor() {
        return this.valor;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public String toString() {
        return this.valor;
    }
}
