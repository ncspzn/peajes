package records;

import java.time.LocalDateTime;
import model.Vehiculo;

public record RegistroPeaje(
        Vehiculo vehiculo,
        String entidadQueCobro,
        double valorCobrado,
        LocalDateTime fechaHora
) {
}
