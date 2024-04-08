package com.softtek.modelo.Ejercicio8;

public class Calculadora {
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) throws DivisionPorCeroException {
        if (num2 == 0) {
            throw new DivisionPorCeroException("No se puede dividir por cero.");
        }
        return num1 / num2;
    }
}
