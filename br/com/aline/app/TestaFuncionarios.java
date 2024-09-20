package br.com.aline.app;

import br.com.aline.modelo.*;

public class TestaFuncionarios {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        Desenvolvedor d = new Desenvolvedor();
        Cliente c = new Cliente();
        SistemaInterno si = new SistemaInterno();
        d.setSalario(1000.0);
        g.setSalario(1000.0);
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
