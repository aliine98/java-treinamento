package br.com.aline.financeiro.app;

import br.com.aline.financeiro.Cnpj;
import br.com.aline.financeiro.Cpf;
import br.com.aline.financeiro.Divida;
import br.com.aline.financeiro.Pagamento;

import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDivida {
    private final Divida divida;

    public RelatorioDeDivida(Divida divida) {
        this.divida = divida;
    }

    public void gerarRelatorio(NumberFormat formatador) {
        System.out.println("Documento credor: " + divida.getDocCredor());
        System.out.println("Credor: " + divida.getCredor());
        System.out.println("Valor pago: " + formatador.format(divida.getValorPago()));
    }

    public static void main(String[] args) {
        Divida divida1 = new Divida(100.0,"Aline",new Cnpj("1233444"));
        Pagamento p1 = new Pagamento("fulano",new Cnpj("1212334"),100.0);
        divida1.registra(p1);

        Divida divida2 = new Divida(100.0,"Pessoa", new Cpf("123234"));
        Pagamento p2 = new Pagamento("ciclano",new Cpf("123344"),50.0);
        divida2.registra(p2);

        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
        RelatorioDeDivida relatorio1 = new RelatorioDeDivida(divida1);
        relatorio1.gerarRelatorio(formatador);
        RelatorioDeDivida relatorio2 = new RelatorioDeDivida(divida2);
        relatorio2.gerarRelatorio(formatador);
    }
}
