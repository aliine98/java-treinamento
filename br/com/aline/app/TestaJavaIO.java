package br.com.aline.app;

import java.io.*;

public class TestaJavaIO {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("input.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        OutputStream os = System.out; //new FileOutputStream("output.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = br.readLine();
        while (line != null) {
            bw.append(line);
            bw.newLine();
            line = br.readLine();
        }

        br.close();
        bw.close();
    }
}
