package br.com.aline.financeiro;

public class GerenciadorDividas {
    public void efetuarPagamento(Divida divida, double valor, Documento docPagador, String pagador) {
        Pagamento pagamento = new Pagamento(pagador,docPagador,valor);
        divida.registra(pagamento); //agora usa-se o registra da lista de pagamentos em vez de ser o
        // método na classe divida
    }
}
