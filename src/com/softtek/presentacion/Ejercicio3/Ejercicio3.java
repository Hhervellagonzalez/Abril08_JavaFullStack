package com.softtek.presentacion.Ejercicio3;

import com.softtek.modelo.Ejercicio3.Coche;
import com.softtek.modelo.Ejercicio3.Conductor;

public class Ejercicio3 {
    public static void main(String[] args) {
        Coche c1 = new Coche(10);
        Conductor conductor = new Conductor(c1);
        System.out.println(conductor.conducir());
    }
}
