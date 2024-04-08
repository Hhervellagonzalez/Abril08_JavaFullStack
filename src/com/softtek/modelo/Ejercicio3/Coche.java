package com.softtek.modelo.Ejercicio3;

public class Coche implements IVehiculo{
    private int deposito;

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public String moverse() {
        if (deposito>0){
           return "Vehiculo en movimiento";
        }else{
            return "El vehiculo no tiene gasolina";
        }

    }
}
