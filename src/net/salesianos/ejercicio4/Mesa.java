package net.salesianos.ejercicio4;

import java.io.Serializable;

public class Mesa implements Serializable {
    private String color;
    private int n_patas;

    public Mesa(String color, int n_patas) {
        this.color = color;
        this.n_patas = n_patas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getN_patas() {
        return n_patas;
    }

    public void setN_patas(int n_patas) {
        this.n_patas = n_patas;
    }

    @Override
    public String toString() {
        return "Mesa [color=" + color + ", n_patas=" + n_patas + "]";
    }

}
