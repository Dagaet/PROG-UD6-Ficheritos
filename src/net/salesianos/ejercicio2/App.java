package net.salesianos.ejercicio2;

import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/net/salesianos/ejercicio2/Fichero.txt");
        int nextChar = fr.read();
        String output = "";
        while (nextChar != -1) {
            char newChar = (char) nextChar;
            System.out.println(newChar + ": " + nextChar);
            nextChar = fr.read();
            output += newChar;
        }

        System.out.println("Tu texto cachanchan: " + output);
        fr.close();
    }
}
