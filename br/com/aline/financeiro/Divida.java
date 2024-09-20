package br.com.aline.financeiro;

public class Divida {
    private double total;
    private String credor;
    private Documento docCredor;
    private Pagamentos pagamentos = new Pagamentos();

    public Divida(double total, String credor, Documento docCredor) {
        this.total = total;
        this.credor = credor;
        this.docCredor = docCredor;
    }

    public double getValorPago() {
        return this.pagamentos.getValorPago();
    }

    public void registra(Pagamento p) {
        this.pagamentos.registra(p);
    }

    public double getTotal() {
        return total;
    }

    public String getCredor() {
        return credor;
    }

    public Documento getDocCredor() {
        return this.docCredor;
    }
}
