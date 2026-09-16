package entidades;

public class Especie {
    private final String nombre;
    private final String nombreCientifico;
    private final String descripcion;

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
}
