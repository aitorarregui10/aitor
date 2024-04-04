package com.softtek.presentacion;
import com.softtek.modelo.Areas;

public class PruebaArea {
    public static void main(String[] args) {
        double radioCirculo = 7.3;
        double baseRectangulo = 8.5;
        double alturaRectangulo = 14.2;

        double areaCirculo = Areas.AreaCirculo(radioCirculo);
        System.out.println("El área del círculo con radio " + radioCirculo + " es: " + areaCirculo);

        double areaRectangulo = Areas.AreaRectangulo(baseRectangulo, alturaRectangulo);
        System.out.println("El área del rectángulo con base " + baseRectangulo + " y altura " + alturaRectangulo + " es: " + areaRectangulo);

    }
}
