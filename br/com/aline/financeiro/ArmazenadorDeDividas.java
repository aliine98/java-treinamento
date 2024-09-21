package br.com.aline.financeiro;

import java.io.FileNotFoundException;

public interface ArmazenadorDeDividas {
    void save(Divida divida);

    Divida get(Documento docCredor);
}
