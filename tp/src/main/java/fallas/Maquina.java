package fallas;

/**
 * Created by agu on 04/07/16.
 */
public class Maquina {
    private Boolean descargaATierra;
    private Boolean zonaDeRiesgo;
    private Boolean sensoresDeDeteccion;
    private Boolean delimitadorDeAcceso;
    private Boolean comandoDeAccionADosManos;

    public Maquina(Boolean descargaATierra, Boolean zonaDeRiesgo, Boolean sensoresDeDeteccion, Boolean delimitadorDeAcceso, Boolean comandoDeAccionADosManos) {
        this.descargaATierra = descargaATierra;
        this.zonaDeRiesgo = zonaDeRiesgo;
        this.sensoresDeDeteccion = sensoresDeDeteccion;
        this.delimitadorDeAcceso = delimitadorDeAcceso;
        this.comandoDeAccionADosManos = comandoDeAccionADosManos;
    }

    public Boolean getDescargaATierra() {
        return descargaATierra;
    }

    public void setDescargaATierra(Boolean descargaATierra) {
        this.descargaATierra = descargaATierra;
    }

    public Boolean getZonaDeRiesgo() {
        return zonaDeRiesgo;
    }

    public void setZonaDeRiesgo(Boolean zonaDeRiesgo) {
        this.zonaDeRiesgo = zonaDeRiesgo;
    }

    public Boolean getSensoresDeDeteccion() {
        return sensoresDeDeteccion;
    }

    public void setSensoresDeDeteccion(Boolean sensoresDeDeteccion) {
        this.sensoresDeDeteccion = sensoresDeDeteccion;
    }

    public Boolean getDelimitadorDeAcceso() {
        return delimitadorDeAcceso;
    }

    public void setDelimitadorDeAcceso(Boolean delimitadorDeAcceso) {
        this.delimitadorDeAcceso = delimitadorDeAcceso;
    }

    public Boolean getComandoDeAccionADosManos() {
        return comandoDeAccionADosManos;
    }

    public void setComandoDeAccionADosManos(Boolean comandoDeAccionADosManos) {
        this.comandoDeAccionADosManos = comandoDeAccionADosManos;
    }
}
