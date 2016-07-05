package src.main.java.fallas;

/**
 * Created by agu on 04/07/16.
 */
public class Ambiente {
    private Double nivelRuido;
    private Double nivelLuz;
    private Boolean delimitacion;

    public Ambiente(Double nivelRuido, Double nivelLuz, Boolean delimitacion) {
        this.nivelRuido = nivelRuido;
        this.nivelLuz = nivelLuz;
        this.delimitacion = delimitacion;
    }

    public Double getNivelRuido() {
        return nivelRuido;
    }

    public void setNivelRuido(Double nivelRuido) {
        this.nivelRuido = nivelRuido;
    }

    public Double getNivelLuz() {
        return nivelLuz;
    }

    public void setNivelLuz(Double nivelLuz) {
        this.nivelLuz = nivelLuz;
    }

    public Boolean getDelimitacion() {
        return delimitacion;
    }

    public void setDelimitacion(Boolean delimitacion) {
        this.delimitacion = delimitacion;
    }
}
