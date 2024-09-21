package br.com.aline.app;

import br.com.aline.modelo.*;

public class TestaFuncionarios {
    public static void main(String[] args) {
        Gerente g = new Gerente("Fulano",1000.0);
        Desenvolvedor d = new Desenvolvedor("Ciclano", 1000.0);
        Cliente c = new Cliente();
        SistemaInterno si = new SistemaInterno();
        TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
        totalizador.adiciona(d);
        totalizador.adiciona(g);
        System.out.println(d.getBonus());
        System.out.println(g.getBonus());
        System.out.println(totalizador.getTotal());
        si.autentica(g);
        si.autentica(c);
    }
}
