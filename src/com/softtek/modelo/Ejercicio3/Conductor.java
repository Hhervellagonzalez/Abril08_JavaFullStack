package com.softtek.modelo.Ejercicio3;

public class Conductor {
    private IVehiculo vehiculo;

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Conductor() {
    }

    public String conducir() {
        return vehiculo.moverse();
    }
}
