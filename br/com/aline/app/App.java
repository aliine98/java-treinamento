package br.com.aline.app;

import br.com.aline.financeiro.*;

import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        //BancoDeDados bd = new BancoDeDados("localhost","aline","123");
        Arquivo bd = new Arquivo();
        BalancoEmpresa balanco = new BalancoEmpresa(bd);
        registraDividas(balanco);
        realizaPagamentos(balanco);
        //bd.close();
    }

    private static void registraDividas(BalancoEmpresa balanco) {
        Divida d1 = new Divida(100.0,"Aline", new Cnpj("1233444"));
        Divida d2 = new Divida(200.0,"Pessoa",new Cpf("12345"));
        balanco.registraDivida(d1);
        balanco.registraDivida(d2);
    }

    private static void realizaPagamentos(BalancoEmpresa balanco) {
        Pagamento p1 = new Pagamento("Fulano",new Cnpj("1234"),100.0);
        Pagamento p2 = new Pagamento("Ciclano", new Cpf("111111"),50.0);
        balanco.pagaDivida(p1);
        balanco.pagaDivida(p2);
    }
}
