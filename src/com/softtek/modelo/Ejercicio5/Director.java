package com.softtek.modelo.Ejercicio5;

public class Director implements Empleado {
    private Informe informe;

    public Director(Informe informe) {
        this.informe = informe;
    }

    public String getTareas() {
        return "Tareas Director";
    }

    public String getInforme() {
        return informe.getInforme();
    }
}
