package br.com.aline.financeiro.app;

import br.com.aline.financeiro.Cnpj;
import br.com.aline.financeiro.Cpf;
import br.com.aline.financeiro.Pagamento;
import br.com.aline.financeiro.Pagamentos;

public class TestaPagamentos {
    public static void main(String[] args) {
        Pagamentos pagamentos = new Pagamentos();
        Pagamento p1 = new Pagamento("Aline",new Cpf("12123424"),200.0);
        Pagamento p2 = new Pagamento("pessoa",new Cnpj("123444"),100.0);
        pagamentos.registra(p1);
        pagamentos.registra(p2);
        System.out.println(pagamentos.getValorPago());

        for (Pagamento pagamento : pagamentos) {
            System.out.println(pagamento.getValor());
        }
        System.out.println(pagamentos.pagamentosComValorMaiorQue(100.0));
    }
}
