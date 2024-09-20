package br.com.aline.financeiro;

public class GerenciadorDividas {
    public void efetuarPagamento(Divida divida, double valor, String cnpjPagador, String pagador) {
        Pagamento pagamento = new Pagamento(pagador,new Cnpj("123344"),valor);
        divida.registra(pagamento); //agora usa-se o registra da lista de pagamentos em vez de ser o
        // método na classe divida
    }
}
