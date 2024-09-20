package br.com.aline.modelo;

import br.com.aline.exception.SaldoInsuficienteException;

import java.util.Objects;

public class Conta implements Comparable<Conta> {
    private int agencia;
    private double saldo;
    private Pessoa titular;
    private int numero;
    private static int totalDeContas = 0;

    public Conta(Pessoa titular, int agencia) {
        this.agencia = agencia;
        totalDeContas++;
        this.numero = totalDeContas;
        this.titular = titular;
    }
    public void saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            throw new SaldoInsuficienteException();
        }
    }

    public synchronized void deposita(double valor) {
        this.saldo += valor;
    }

    public  double getSaldo() {
        return  this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Conta)) return false;
        return getNumero() == ((Conta) o).getNumero();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero());
    }

    @Override
    public int compareTo(Conta outra) {
        return this.titular.nome.compareTo(outra.titular.nome);
    }
}
