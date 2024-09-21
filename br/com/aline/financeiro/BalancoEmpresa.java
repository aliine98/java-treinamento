package br.com.aline.financeiro;

import java.io.FileNotFoundException;

public class BalancoEmpresa {
    private ArmazenadorDeDividas dividas;

    public BalancoEmpresa(ArmazenadorDeDividas bd) {
        this.dividas = bd;
    }

    public void registraDivida(Divida divida) {
        dividas.save(divida);
    }

    public void pagaDivida(Pagamento pagamento) {
        Divida divida = dividas.get(pagamento.getDocPagador());
        if (divida != null) {
            divida.registra(pagamento);
        }
        dividas.save(divida);
    }
}
