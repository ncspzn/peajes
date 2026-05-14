package model;

import enumpackage.Departamento;
import interfaces.Cobrable;
import records.RegistroPeaje;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje implements Cobrable {

    private String nombre;
    private Departamento departamento;
    private double totalRecolectado;

    private List<RegistroPeaje> listaRegistros;
    private List<Recaudador> listaRecaudadores;
    private List<Vehiculo> listaVehiculos;

    public EstacionPeaje(String nombre, Departamento departamento) {

        this.nombre = nombre;
        this.departamento = departamento;

        this.totalRecolectado = 0;

        listaRegistros = new ArrayList<>();
        listaRecaudadores = new ArrayList<>();
        listaVehiculos = new ArrayList<>();
    }

    @Override
    public double cobrarPeaje(Vehiculo vehiculo) {

        double valor = vehiculo.calcularPeaje();

        totalRecolectado += valor;

        vehiculo.setNumeroPeajesPagados(
                vehiculo.getNumeroPeajesPagados() + 1
        );

        RegistroPeaje registro = new RegistroPeaje(
                vehiculo,
                nombre,
                valor,
                LocalDateTime.now()
        );

        listaRegistros.add(registro);
        listaVehiculos.add(vehiculo);

        return valor;
    }

    public List<Camion> obtenerCamionesMayores10Toneladas() {

        List<Camion> listaCamiones = new ArrayList<>();

        for (Vehiculo vehiculo : listaVehiculos) {

            if (vehiculo instanceof Camion camion) {

                if (camion.getCapacidadCarga() > 10 &&
                        camion.getNumeroPeajesPagados() > 5) {

                    listaCamiones.add(camion);
                }
            }
        }

        return listaCamiones;
    }

    public void agregarRecaudador(Recaudador recaudador) {
        listaRecaudadores.add(recaudador);
    }

    public String getNombre() {
        return nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public double getTotalRecolectado() {
        return totalRecolectado;
    }

    public List<RegistroPeaje> getListaRegistros() {
        return listaRegistros;
    }
}
