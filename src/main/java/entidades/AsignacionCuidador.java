package entidades;

import java.util.Date;

public class AsignacionCuidador {
    private Cuidador cuidador;
    private Especie especie;
    private Date fecha;

    public AsignacionCuidador(Cuidador cuidador, Especie especie, Date fecha) {
        this.cuidador = cuidador;
        this.especie = especie;
        this.fecha = fecha;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
