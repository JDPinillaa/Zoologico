package entidades;

public class Zona {
    private String nombre;
    private double extencionMetrosCuadrados;

    public Zona(String nombre, double extencionMetrosCuadrados) {
        this.nombre = nombre;
        this.extencionMetrosCuadrados = extencionMetrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExtencionMetrosCuadrados() {
        return extencionMetrosCuadrados;
    }

    public void setExtencionMetrosCuadrados(double extencionMetrosCuadrados) {
        this.extencionMetrosCuadrados = extencionMetrosCuadrados;
    }
}
