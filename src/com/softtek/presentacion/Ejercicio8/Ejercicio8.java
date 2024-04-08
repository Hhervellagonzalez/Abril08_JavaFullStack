package com.softtek.presentacion.Ejercicio8;

import com.softtek.modelo.Ejercicio8.Calculadora;
import com.softtek.modelo.Ejercicio8.DivisionPorCeroException;

public class Ejercicio8 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        try {
            System.out.println( calculadora.sumar(10, 5));
            System.out.println( calculadora.restar(10, 5));
            System.out.println( calculadora.multiplicar(10, 5));
            System.out.println( calculadora.dividir(10, 5));
            System.out.println(calculadora.dividir(10 , 2));
            System.out.println( calculadora.dividir(10, 0));
        } catch (DivisionPorCeroException e) {
            System.err.println("Error en la operación matemática: " + e.getMessage());
        }
    }
}

