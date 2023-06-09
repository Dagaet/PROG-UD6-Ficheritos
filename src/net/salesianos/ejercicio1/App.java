package net.salesianos.ejercicio1;

import java.io.Console;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        Console console = System.console();
        FileWriter fw = new FileWriter("src/net/salesianos/ejercicio1/fichero.txt");

        System.out.println("Introduzca al menos treinta caracteres");
        String texto = console.readLine("Escriba un nombre \n");
        texto = texto.replace(" ", "");

        if (texto.length() <= 30) {
            System.out.println("El texto no cumple con los parametros");
            System.out.println("Le faltan " + (30 - texto.length()) + " caracteres.");
        } else {
            fw.write(texto);
        }
        fw.close();

    }
}
