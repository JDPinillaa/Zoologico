package entidades;

import java.sql.Time;

public class AsignacionGuia {
    private Time hora;
    private Guia guia;
    private Itinerario itinerario;

    public AsignacionGuia(Time hora, Guia guia, Itinerario itinerario) {
        this.hora = hora;
        this.guia = guia;
        this.itinerario = itinerario;
    }
}
