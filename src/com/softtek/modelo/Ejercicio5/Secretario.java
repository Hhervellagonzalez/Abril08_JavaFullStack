package com.softtek.modelo.Ejercicio5;

public class Secretario implements Empleado{

    private Informe informe;
    private String empresa;
    private String email;


    public Secretario(Informe informe, String empresa, String email) {
        this.informe = informe;
        this.empresa = empresa;
        this.email = email;
    }

    public Secretario() {
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "Tareas Secretario";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
