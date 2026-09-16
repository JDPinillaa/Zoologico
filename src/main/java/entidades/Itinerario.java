package entidades;

import java.util.ArrayList;
import java.util.List;

public class Itinerario {
    private static int itinerarioId;
    private double duracionHoras;
    private double longitud;
    private int maxVisitantes;
    private int especiesVisitadas;

    private List<Zona> zonas = new ArrayList<>();



    public Itinerario(double duracionHoras, double longitud, int maxVisitantes, int especiesVisitadas) {
        this.duracionHoras = duracionHoras;
        this.longitud = longitud;
        this.maxVisitantes = maxVisitantes;
        this.especiesVisitadas = especiesVisitadas;

        itinerarioId++;
    }

    public static int getItinerarioId() {
        return itinerarioId;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getMaxVisitantes() {
        return maxVisitantes;
    }

    public void setMaxVisitantes(int maxVisitantes) {
        this.maxVisitantes = maxVisitantes;
    }

    public int getEspeciesVisitadas() {
        return especiesVisitadas;
    }

    public void setEspeciesVisitadas(int especiesVisitadas) {
        this.especiesVisitadas = especiesVisitadas;
    }

    public List<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(List<Zona> zonas) {
        this.zonas = zonas;
    }

    public void agregarZona(Zona zona){
        zonas.add(zona);
   }
}
