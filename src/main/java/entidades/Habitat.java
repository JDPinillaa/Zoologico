package entidades;

import java.util.ArrayList;
import java.util.List;

public class Habitat {
    private final String nombre;
    private final String clima;
    private final String tipoVegetacion;
    private List<String> continentes = new ArrayList<>();

    public Habitat(String nombre,  String clima, String tipoVegetacion, List<String> continentes) {
        this.nombre = nombre;
        this.clima = clima;
        this.tipoVegetacion = tipoVegetacion;
        this.continentes = continentes;

    }

    public String getNombre() {
        return nombre;
    }

    public String getClima() {
        return clima;
    }

    public String getTipoVegetacion() {
        return tipoVegetacion;
    }

    public List<String> getContinentes() {
        return continentes;
    }

    public void setContinentes(List<String> continentes) {
        this.continentes = continentes;
    }
}
