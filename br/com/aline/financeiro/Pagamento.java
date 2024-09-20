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
        return pagador;
    }

    public Documento getDocPagador() {
        return docPagador;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "pagador='" + pagador + '\'' +
                ", docPagador=" + docPagador +
                ", valor=" + valor +
                '}';
    }
}
