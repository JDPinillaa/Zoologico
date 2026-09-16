package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cuidador extends Empleado {

    private List<AsignacionCuidador> asignaciones = new ArrayList<>();

    public Cuidador(String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
    }

    public List<AsignacionCuidador> getAsignaciones() {
        return asignaciones;
    }

    public void agregarAsignacion(AsignacionCuidador asignacionCuidador){
        asignaciones.add(asignacionCuidador);
    }
}
