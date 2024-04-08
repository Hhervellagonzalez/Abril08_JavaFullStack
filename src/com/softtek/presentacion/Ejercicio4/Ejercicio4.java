package com.softtek.presentacion.Ejercicio4;

import com.softtek.modelo.Ejercicio4.Coche;
import com.softtek.modelo.Ejercicio4.TallerMecanica;
import com.softtek.modelo.Ejercicio4.TallerPintura;

public class Ejercicio4 {
    public static void main(String[] args) {
        Coche c1 = new Coche("1234HHG", "alfa romeo");
        TallerMecanica tm = new TallerMecanica();
        TallerPintura tp = new TallerPintura();

        System.out.println(tm.reparar(c1));
        System.out.println(tp.reparar(c1));

    }
}
