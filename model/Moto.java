package model;

import records.Conductor;

public class Moto extends Vehiculo {

    private int cilindraje;

    public Moto(String placa,
                int numeroPeajesPagados,
                Conductor conductor,
                int cilindraje) {

        super(placa, numeroPeajesPagados, conductor);

        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularPeaje() {

        double peaje = 5000;

        if (cilindraje > 200) {
            peaje += 2000;
        }

        return peaje;
    }

    public int getCilindraje() {
        return cilindraje;
    }
}
