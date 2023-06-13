package net.salesianos.ejercicio4;

import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MesaHelper {
    private final static Console CONSOLE = System.console();

    public static void newMesa() throws Exception {
        System.out.println("Color: ");
        String color = CONSOLE.readLine();
        System.out.println("Patas: ");
        Integer patas = Integer.parseInt(CONSOLE.readLine());
        Mesa mesa = new Mesa(color, patas);

        try {
            FileOutputStream f = new FileOutputStream("src/net/salesianos/ejercicio4/Actividad4.txt");
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(mesa);
            o.close();
            f.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            e.printStackTrace();
        }

    }

    public static void obtenerMesas() throws Exception {
        try {
            FileInputStream fi = new FileInputStream("src/net/salesianos/ejercicio4/Actividad4.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);

            Mesa m = (Mesa) oi.readObject();
            System.out.println(m.toString());

            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
