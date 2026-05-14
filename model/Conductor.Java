package records;

import java.time.LocalDate;
import java.util.List;
import model.Vehiculo;

public record Conductor(
        String nombre,
        String apellidos,
        String documento,
        LocalDate fechaNacimiento,
        List<Vehiculo> listaVehiculos
) {
}
