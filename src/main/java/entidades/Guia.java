package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Guia extends Empleado {
    private List<AsignacionGuia> asignaciones = new ArrayList<>();


    public Guia(String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
    }

    public List<AsignacionGuia> getAsignaciones() {
        return asignaciones;
    }

    public void agregarAsignacion(AsignacionGuia asignacionGuia){
        asignaciones.add(asignacionGuia);
    }
}
