package com.softtek.presentacion.Ejercicio1;

import com.softtek.modelo.Ejercicio1.Buitre;
import com.softtek.modelo.Ejercicio1.Perro;

public class Ejercicio1 {
    public static void main(String[] args) {
        Perro perro = new Perro();
        System.out.println(perro.Comer());
        System.out.println(perro.Moverse());

        Buitre buitre = new Buitre();
        System.out.println(buitre.Comer());
        System.out.println(buitre.Moverse());
    }
}
