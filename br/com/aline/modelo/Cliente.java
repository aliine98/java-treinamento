package br.com.aline.modelo;

public class Cliente implements Autenticavel {
    private String nome;
    @Override
    public boolean autentica(int senha) {
        return false;
    }
}
