package com.softtek.modelo;

public class Alumno {

    private String nombreCompleto;

    private int[] notasParciales;

    public double calcularParciales() {
        int sum = 0;
        for (int grade : notasParciales) {
            sum += grade;
        }
        return (double) sum / notasParciales.length;
    }

    public void notaFinal() {
    }


    public Alumno() {
    }

    public Alumno(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
        this.notasParciales = new int[4];
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int[] getNotasParciales() {
        return notasParciales;
    }

    public void setNotasParciales(int[] notasParciales) {
        this.notasParciales = notasParciales;
    }

}


