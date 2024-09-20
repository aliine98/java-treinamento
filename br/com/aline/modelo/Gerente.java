package br.com.aline.modelo;

public class Gerente extends Funcionario implements Autenticavel {
    @Override
    public double getBonus() {
        return this.salario * 0.3;
    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }
}
