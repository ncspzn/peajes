package model;

public class Carro extends Vehiculo {

    private boolean electrico;
    private boolean servicioPublico;

    public Carro(String placa,
                  int numeroPeajesPagados,
                  Conductor conductor,
                  boolean electrico,
                  boolean servicioPublico) {

        super(placa, numeroPeajesPagados, conductor);

        this.electrico = electrico;
        this.servicioPublico = servicioPublico;
    }

    @Override
    public double calcularPeaje() {

        double peaje = 10000;

        if (electrico) {
            peaje = peaje - (peaje * 0.20);
        }

        if (servicioPublico) {
            peaje = peaje + (peaje * 0.15);
        }

        return peaje;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public boolean isServicioPublico() {
        return servicioPublico;
    }
}