package com.softtek.presentacion;

public class TiposPrimitivos {

        public static  int areaCuadrado(){

        // Calcular el área de uyn cuadrado cuyo lado mide 6

            int a = 6;
            int area = a * a;
            System.out.println("El area es " + area);
            return area;
        }

        public static double areaCirculo () {

        // Calcular el área de un círculo cuyo radio es 3

            int r = 3;
            double areaC = 2 * r * Math.PI;
            System.out.println("El area es " + areaC);
            return areaC;
        }

        public static int perimetro (){

            //Calcular el perímetro de un rectángulo cuya base es 4 y altura 3

            int lado1 = 4;
            int lado2 = 3;
            int perimetro = lado1 * 2 + lado2 * 2;
            System.out.println("El area es " + perimetro);
            return perimetro;
        }
    }
