package br.com.aline.app;

import br.com.aline.modelo.Conta;
import br.com.aline.modelo.Pessoa;

import java.util.*;

public class TestaCollections {
    public static void main(String[] args) {
        List<String> nomes = new LinkedList<>();
        nomes.add("Pessoa");
        nomes.add("Aline");
        for (String nome: nomes) {
            System.out.println(nome);
        }
        Collections.sort(nomes);
        System.out.println("Ordenado:");
        for (String nome: nomes) {
            System.out.println(nome);
        }

        List<Conta> contas = new ArrayList<>();
        Conta c1 = new Conta(new Pessoa("Pessoa"),123);
        Conta c2 = new Conta(new Pessoa("Aline"),1232);
        contas.add(c1);
        contas.add(c2);
        for (Conta conta : contas) {
            System.out.println(conta);
        }
        Collections.sort(contas);
        System.out.println("Ordenado:");
        for (Conta conta : contas) {
            System.out.println(conta);
        }

        Set<Conta> contaSet = new HashSet<>();
        contaSet.add(c1);
        contaSet.add(c2);
        System.out.println(contaSet.size());
        contaSet.add(c1);
        System.out.println(contaSet.size());
    }
}
