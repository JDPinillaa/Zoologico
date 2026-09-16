package entidades;

import java.util.ArrayList;
import java.util.List;

public class Especie {
    private final String nombre;
    private final String nombreCientifico;
    private final String descripcion;

    private List<Habitat> habitats = new ArrayList<>();

    public Especie(String nombre, String nombreCientifico, String descripcion) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Habitat> getHabitats() {
        return habitats;
    }

    public void setHabitats(List<Habitat> habitats) {
        this.habitats = habitats;
    }

    public void agregarHabitat(Habitat habitat){
        habitats.add(habitat);
    }
}
