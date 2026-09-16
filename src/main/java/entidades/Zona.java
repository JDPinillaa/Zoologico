package entidades;

import java.util.ArrayList;
import java.util.List;

public class Zona {
    private String nombre;
    private double extencionMetrosCuadrados;

    private List<Especie> especies = new ArrayList<>();

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

    public List<Especie> getEspecies() {
        return especies;
    }

    public void setEspecies(List<Especie> especies) {
        this.especies = especies;
    }

    public void agregarEspecie(Especie especie){
        especies.add(especie);
    }
}
