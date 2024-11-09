/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formas;

/**
 *
 * 
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa de cálculo de áreas de formas");

        System.out.print("Ingrese el color de la forma: ");
        String color = scanner.nextLine();

        System.out.print("Seleccione una forma (1. Círculo 2. Triángulo 3. Cuadrado 4. Línea): ");
        int opcion = scanner.nextInt();

        Formas forma;

        switch (opcion) {
            case 1:
            forma = new Circulo();
            double area = obtenerValor(scanner, "Ingrese el área del círculo: ");
            forma.establecerColor(color);
            forma.setNombre("Círculo"); 
            System.out.println("El color de la forma es: " + color);
            ((Circulo) forma).setArea(area);
            double radioCirculo = ((Circulo) forma).calcularRadio();
            System.out.println("El radio del círculo es: " + radioCirculo);
            forma.dibujar();
            break;
            case 2:
                forma = new Triangulo();
                double base = obtenerValor(scanner, "Ingrese la base del triángulo: ");
                double altura = obtenerValor(scanner, "Ingrese la altura del triángulo: ");
                forma.establecerColor(color);
                forma.setNombre("Triangulo");
                System.out.println("El color de la forma es: " + color);
                double areaTriangulo = ((Triangulo) forma).calcularArea(base, altura);
                System.out.println("El área del triángulo es: " + areaTriangulo);
                forma.dibujar();
                break;
            case 3:
                forma = new Cuadrado();
                double lado = obtenerValor(scanner, "Ingrese el lado del cuadrado: ");
                forma.establecerColor(color);
                forma.setNombre("Cuadrado");
                System.out.println("El color de la forma es: " + color);
                double areaCuadrado = ((Cuadrado) forma).calcularArea(lado);
                System.out.println("El área del cuadrado es: " + areaCuadrado);
                forma.dibujar();
                break;
            case 4:
                forma = new Linea();
                double longitud = obtenerValor(scanner, "Ingrese la longitud de la línea: ");
                ((Linea) forma).setLongitud(longitud);
                forma.setNombre("Linea");
                System.out.println("La línea no tiene área.");
                forma.dibujar();
                break;
            default:
                System.out.println("Ingrese una opción válida");
        }
    }
    private static double obtenerValor(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
}
