package br.com.aline.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaScannerEPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        PrintStream ps = new PrintStream("print.txt");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            ps.println(line);
        }
        sc.close();
        ps.close();
    }
}
