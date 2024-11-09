/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formas;

/**
 *
 * 
 */

 
public class Triangulo extends Formas {
    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }
     @Override
    public void dibujar() {
        System.out.println("triángulo: " + getNombre());
    }
}
