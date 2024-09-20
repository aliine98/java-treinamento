package br.com.aline.financeiro;

import java.util.HashMap;
import java.util.Map;

public class BancoDeDados implements ArmazenadorDeDividas{
    private Map<Documento, Divida> dividas = new HashMap<>();

    public BancoDeDados(String host, String user, String pass) {
        System.out.println("Conectado");
    }

    public void save(Divida divida) {
        dividas.put(divida.getDocCredor(),divida);
    }

    public Divida get(Documento docCredor) {
        return dividas.get(docCredor);
    }

    public void close() {
        System.out.println("Desconectado");
    }
}
