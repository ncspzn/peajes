package model;

import records.Conductor;

public abstract class Vehiculo {

    protected String placa;
    protected int numeroPeajesPagados;
    protected Conductor conductor;

    public Vehiculo(String placa, int numeroPeajesPagados, Conductor conductor) {
        this.placa = placa;
        this.numeroPeajesPagados = numeroPeajesPagados;
        this.conductor = conductor;
    }

    public abstract double calcularPeaje();

    public String getPlaca() {
        return placa;
    }

    public int getNumeroPeajesPagados() {
        return numeroPeajesPagados;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setNumeroPeajesPagados(int numeroPeajesPagados) {
        this.numeroPeajesPagados = numeroPeajesPagados;
    }
}
