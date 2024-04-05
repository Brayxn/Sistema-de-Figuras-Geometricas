
package com.mycompany.mavenproject1;


public class Rectangulo extends FiguraGeometrica {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        super("Rectángulo");
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return largo * ancho;
    }

    @Override
    public double perimetro() {
        return 2 * (largo + ancho);
    }
}
