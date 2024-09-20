package br.com.aline.modelo;

public class Progresso implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("progresso");
        }
    }
}
