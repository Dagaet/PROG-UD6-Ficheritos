package net.salesianos.ejercicio3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("src/net/salesianos/ejercicio3/ejercicio3.txt");
        FileWriter fw = new FileWriter("src/net/salesianos/ejercicio3/ejercicio3.txt");
        FileReader fr1 = new FileReader("src/net/salesianos/ejercicio1/fichero.txt");
        FileReader fr2 = new FileReader("src/net/salesianos/ejercicio2/Fichero.txt");

        file.createNewFile();
        int nextChar = fr1.read();
        String output = "";
        while (nextChar != -1) {
            char newChar = (char) nextChar;
            nextChar = fr1.read();
            output += newChar;
        }
        String fOutput1 = "Contenido del fichero Uno: " + output + "\n";
        fw.write(fOutput1);

        int nextChar2 = fr2.read();
        String output2 = "";
        while (nextChar2 != -1) {
            char newChar2 = (char) nextChar2;
            nextChar2 = fr2.read();
            output2 += newChar2;
        }

        String fOutput2 = "Contenido del fichero Dos: " + output2 + "\n";
        fw.write(fOutput2);

        String firma = "Esto está firmado supongo\n";
        fw.write(firma);

        fw.close();
        fr1.close();
        fr2.close();

    }
}
