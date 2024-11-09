/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formas;

/**
 *
 * 
 */

public class Cuadrado extends Formas {
    public double calcularArea(double lado) {
        return lado * lado;
    }
    @Override
    public void dibujar() {
        System.out.println("cuadrado: " + getNombre());
    }
}