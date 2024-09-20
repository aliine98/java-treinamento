package br.com.aline.financeiro;

public class Cnpj implements Documento {
    private String valor;

    public Cnpj(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public boolean isValid() {
        return primeiroDigitoCorreto() == primeiroDigitoVerificador() && segundoDigitoCorreto() == segundoDigitoVerificador();
    }

    private int primeiroDigitoCorreto() {
        return 1;
    }

    private int segundoDigitoCorreto() {
        return 2;
    }

    private int primeiroDigitoVerificador() {
        return 1;
    }

    private int segundoDigitoVerificador() {
        return 2;
    }

    @Override
    public String toString() {
        return this.valor;
    }
}
