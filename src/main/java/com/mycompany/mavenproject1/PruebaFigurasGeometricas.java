package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class PruebaFigurasGeometricas {
    public static void main(String[] args) {
        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Circulo(5)); // Radio
        figuras.add(new Rectangulo(4, 5)); // Largo, Ancho
        figuras.add(new Cuadrado(4)); // Lado

        for (FiguraGeometrica figura : figuras) {
            System.out.println("La figura " + figura.getNombre() + " tiene:");
            System.out.println("- Área: " + figura.area() + " unidades cuadradas.");
            System.out.println("- Perímetro: " + figura.perimetro() + " unidades.");
            System.out.println();
        }
    }
}
