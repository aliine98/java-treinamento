package br.com.aline.modelo;

public class FazDeposito implements Runnable{
    private final Conta conta;

    public FazDeposito(Conta c) {
        this.conta = c;
    }

    @Override
    public void run() {
        conta.deposita(100.0);
    }
}
