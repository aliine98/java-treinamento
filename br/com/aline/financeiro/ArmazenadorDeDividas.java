package br.com.aline.financeiro;

public interface ArmazenadorDeDividas {
    public void save(Divida divida);

    public Divida get(Documento docCredor);
}
