package com.softtek.modelo;

public class Areas {
    public static double AreaCirculo(double radioCirculo) {
        return Math.PI * radioCirculo * radioCirculo;
    }

    public static double AreaRectangulo(double baseRectangulo, double alturaRectangulo) {
        return baseRectangulo * alturaRectangulo;
    }
}