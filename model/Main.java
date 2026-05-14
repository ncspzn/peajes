package main;

import enumpackage.Departamento;
import model.*;
import records.Conductor;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Conductor conductor = new Conductor(
                "Juan",
                "Perez",
                "12345",
                LocalDate.of(1990, 5, 10),
                new ArrayList<>()
        );

        Camion camion = new Camion(
                "ABC123",
                6,
                conductor,
                4,
                12
        );

        EstacionPeaje estacion = new EstacionPeaje(
                "Peaje Armenia",
                Departamento.QUINDIO
        );

        double valor = estacion.cobrarPeaje(camion);

        System.out.println("Valor pagado: " + valor);

        System.out.println("Total recolectado: "
                + estacion.getTotalRecolectado());

        System.out.println("Camiones filtrados: "
                + estacion.obtenerCamionesMayores10Toneladas().size());
    }
}
