package br.com.aline.modelo;

public class SistemaInterno {
    public void autentica(Autenticavel a) {
        int senha = 123;
        if(a.autentica(senha)) {
            System.out.println("Bem-vindo ao sistema");
        } else {
            System.out.println("Senha incorreta");
        }
    }
}
