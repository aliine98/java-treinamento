package br.com.aline.app;

import br.com.aline.exception.SaldoInsuficienteException;
import br.com.aline.modelo.Conta;
import br.com.aline.modelo.Pessoa;

public class teste_conta {

    public static void main(String[] args) {
        Pessoa a = new Pessoa("Aline");
        Conta c = new Conta(a,1);
        c.deposita(100.0);
        try {
            c.saca(150.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c.getSaldo());
        System.out.println(c.getNumero());
        Pessoa b = new Pessoa("Pessoa");
        Conta c2 = new Conta(b,1);
        System.out.println(c2.getNumero());
        if (c.equals(c2)) {
            System.out.println("são iguais");
        } else {
            System.out.println("são diferentes");
        }
    }
}
