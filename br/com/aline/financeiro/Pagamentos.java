package br.com.aline.financeiro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//a lista de pagamentos da divida agora tem uma classe com métodos próprios
public class Pagamentos implements Iterable<Pagamento> {
    private double valorPago;
    private ArrayList<Pagamento> pagamentos = new ArrayList<>();

    private void paga(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor inválido para pagamento");
        if (valor > 100) {
            valor = valor - 8;
        }
        this.valorPago += valor;
    }

    public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        this.paga(pagamento.getValor());
    }

    public double getValorPago() {
        return valorPago;
    }

    public List<Pagamento> pagamentosComValorMaiorQue(double valor) {
        ArrayList<Pagamento> pagamentoFiltrados = new ArrayList<>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getValor() > valor) {
                pagamentoFiltrados.add(pagamento);
            }
        }
        return pagamentoFiltrados;
    }

    @Override
    public Iterator<Pagamento> iterator() {
        return this.pagamentos.iterator();
    }
}
