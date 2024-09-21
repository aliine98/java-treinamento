package br.com.aline.financeiro;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Arquivo implements ArmazenadorDeDividas{
    private PrintStream ps = new PrintStream("lista-dividas.txt");

    public Arquivo() throws FileNotFoundException {
    }

    @Override
    public void save(Divida divida) {
        ps.println(divida);
    }

    @Override
    public Divida get(Documento docCredor) {
        return null;
    }
}
