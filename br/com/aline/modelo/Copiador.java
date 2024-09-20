package br.com.aline.modelo;

public class Copiador implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("copiador");
        }
    }
}
