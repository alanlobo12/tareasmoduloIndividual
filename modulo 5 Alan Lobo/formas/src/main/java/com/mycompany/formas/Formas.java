/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formas;

/**
 *
 * 
 */

public class Formas {
    private String nombre;
    private String color;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void establecerColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void dibujar() {
    System.out.println("Dibujando " + getNombre());
}
}

