package com.softtek.presentacion.Ejercicio5;


import com.softtek.modelo.Ejercicio5.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        InformeTrimestre1 informeT1 = new InformeTrimestre1();
        InformeTrimestre2 informeT2 = new InformeTrimestre2();

        Jefe jefe = new Jefe(informeT1);
        Director director = new Director(informeT2);
        Secretario secretario = new Secretario(informeT1, "Softtek", "secretario@softtek.com");

        System.out.println("Jefe: " + jefe.getTareas());
        System.out.println("Jefe Informe: " + jefe.getInforme());

        System.out.println("Director: " + director.getTareas());
        System.out.println("Director Informe: " + director.getInforme());

        System.out.println("Secretario: " + secretario.getTareas());
        System.out.println("Secretario Informe: " + secretario.getInforme());
    }
}
