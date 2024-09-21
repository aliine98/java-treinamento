package br.com.aline.financeiro;

public class Pagamento {
    private String pagador;
    private Documento docPagador;
    private double valor;

    public Pagamento(String pagador, Documento doc, double v) {
        this.pagador = pagador;
        this.docPagador = doc;
        this.valor = v;
    }

    public String getPagador() {
        return this.pagador;
    }

    public Documento getDocPagador() {
        return this.docPagador;
    }

    public double getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return "Pagamento {" +
                "pagador='" + this.pagador + '\'' +
                ", docPagador=" + this.docPagador +
                ", valor=" + this.valor +
                '}';
    }
}
