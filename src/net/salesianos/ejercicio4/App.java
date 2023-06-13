package net.salesianos.ejercicio4;

import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        String option = "-1";
        Console console = System.console();

        while (option != "3") {
            System.out.println("Escriba lo que quiere hacer");
            System.out.println("1. Guardar mesa");
            System.out.println("2. Mostrar las mesas");
            System.out.println("3. Salir");
            option = console.readLine();

            switch (option) {
                case "1":
                    MesaHelper.newMesa();
                    break;
                case "2":
                    MesaHelper.obtenerMesas();
                    break;
                case "3":
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("No son las opciones indicadas");
                    break;
            }
        }
    }
}
