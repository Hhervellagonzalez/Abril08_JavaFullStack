package com.softtek.modelo.Ejercicio5;

public class Jefe implements Empleado {
    private Informe informe;

    public Jefe(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "Tareas jefe";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
