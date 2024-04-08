package com.softtek.presentacion.Ejercicio2;

import com.softtek.modelo.Ejercicio2.Avion;
import com.softtek.modelo.Ejercicio2.Barcaza;
import com.softtek.modelo.Ejercicio2.Helicoptero;
import com.softtek.modelo.Ejercicio2.Hidroavion;

public class Ejercicio2 {
    public static void main(String[] args) {

        Avion Avion = new Avion();
        Barcaza Barcaza = new Barcaza();
        Helicoptero Helicoptero = new Helicoptero();
        Hidroavion Hidroavion = new Hidroavion();

        System.out.println(Avion.despegar());
        System.out.println(Avion.volar());
        System.out.println(Avion.aterrizar());

        System.out.println(Barcaza.atracar());
        System.out.println(Barcaza.navegar());

        System.out.println(Helicoptero.despegar());
        System.out.println(Helicoptero.volar());
        System.out.println(Helicoptero.aterrizar());

        System.out.println(Hidroavion.despegar());
        System.out.println(Hidroavion.volar());
        System.out.println(Hidroavion.aterrizar());
        System.out.println(Hidroavion.atracar());
        System.out.println(Hidroavion.navegar());
    }
}


