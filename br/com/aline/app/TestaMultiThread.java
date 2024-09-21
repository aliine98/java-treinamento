package br.com.aline.app;

import br.com.aline.modelo.*;

public class TestaMultiThread {
    public static void main(String[] args) throws InterruptedException {
        /*Progresso p = new Progresso();
        Copiador c = new Copiador();
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();*/

        Conta c1 = new Conta(new Pessoa("Aline"),123);
        FazDeposito fd = new FazDeposito(c1);
        Thread t1 = new Thread(fd);
        Thread t2 = new Thread(fd);
        System.out.println(c1.getSaldo());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c1.getSaldo());
    }
}
