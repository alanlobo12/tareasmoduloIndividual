/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formas;

/**
 *
 * 
 */

public class Circulo extends Formas {
    private double area;

    public void setArea(double area) {
        this.area = area;
    }

    public double calcularRadio() {
        return Math.sqrt(area / Math.PI);
    }
     @Override
    public void dibujar() {
        System.out.println("círculo: " + getNombre());
    }
}