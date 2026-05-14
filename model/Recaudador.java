package model;

import java.time.LocalDate;

public class Recaudador {

    private String nombre;
    private String apellidos;
    private String documento;
    private LocalDate fechaNacimiento;
    private double sueldoMensual;

    public Recaudador(String nombre,
                      String apellidos,
                      String documento,
                      LocalDate fechaNacimiento,
                      double sueldoMensual) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }
}
