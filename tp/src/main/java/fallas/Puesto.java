package fallas;
/**
 * Created by agu on 04/07/16.
 */


public class Puesto {
    private Boolean operadorAprobado;
    private Boolean maquinaAprobado;
    private Boolean ambienteAprobado;
    private String nombre;

    //Operador
    private Double nivelRuido;
    private Boolean ropaDeTrabajo;
    private Integer antiguedad;
    private Boolean protecciónVisual;
    private Boolean protecciónAuditiva;

    //Ambiente
    private Boolean zapatosDeSeguridad;
    private Double nivelLuz;
    private Boolean delimitacion;

//    Maquina
private Boolean descargaATierra;
    private Boolean zonaDeRiesgo;
    private Boolean sensoresDeDeteccion;
    private Boolean delimitadorDeAcceso;
    private Boolean comandoDeAccionADosManos;
    private Boolean cumpleProteccionPersonal;
    private Boolean cumpleHigieneDelAmbienteLaboral;
    private Boolean cumpleSeguridadAmbiente;
    private Boolean cumplePuestoDeTrabajo;

    public Puesto() {
        this.operadorAprobado = false;
        this.maquinaAprobado = false;
        this.ambienteAprobado = false;
        this.nombre = "";
        this.nivelRuido = 0.0;
        this.ropaDeTrabajo = false;
        this.antiguedad = 0;
        this.protecciónVisual = false;
        this.protecciónAuditiva = false;
        this.zapatosDeSeguridad = false;
        this.nivelLuz = 0.0;
        this.delimitacion = false;
        this.descargaATierra = false;
        this.zonaDeRiesgo = false;
        this.sensoresDeDeteccion = false;
        this.delimitadorDeAcceso = false;
        this.comandoDeAccionADosManos = false;

        this.cumpleProteccionPersonal = true;
        this.cumpleHigieneDelAmbienteLaboral = true;
        this.cumpleSeguridadAmbiente = true;
        this.cumplePuestoDeTrabajo = false;

    }




    public String getStatus() {
        String reporte = "Verificando puesto " + this.nombre + "\n";
        if (!cumpleProteccionPersonal) {
            reporte = reporte + "Operador: La proteccion personal del operador no esta aprobada\n";
        }
        if (!cumpleHigieneDelAmbienteLaboral) {
            reporte = reporte + "Ambiente: La higiene del ambiente laboral no esta aprobada\n";
        }
        if (!cumpleSeguridadAmbiente) {
            reporte = reporte + "Ambiente: La seguridad del ambiente laboral no esta aprobada\n";
        }
        if (!cumplePuestoDeTrabajo) {
            reporte = reporte + "Puesto de trabajo: El puesto de trabajo no esta aprobado\n";
        } else {
            reporte = reporte + "Puesto de trabajo: El puesto de trabajo esta aprobado\n";
        }
        return reporte;
    }

    public Boolean getOperadorAprobado() {
        return operadorAprobado;
    }

    public void setOperadorAprobado(Boolean operadorAprobado) {
        this.operadorAprobado = operadorAprobado;
    }

    public Boolean getMaquinaAprobado() {
        return maquinaAprobado;
    }

    public void setMaquinaAprobado(Boolean maquinaAprobado) {
        this.maquinaAprobado = maquinaAprobado;
    }

    public Boolean getAmbienteAprobado() {
        return ambienteAprobado;
    }

    public void setAmbienteAprobado(Boolean ambienteAprobado) {
        this.ambienteAprobado = ambienteAprobado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNivelRuido() {
        return nivelRuido;
    }

    public void setNivelRuido(Double nivelRuido) {
        this.nivelRuido = nivelRuido;
    }

    public Boolean getRopaDeTrabajo() {
        return ropaDeTrabajo;
    }

    public void setRopaDeTrabajo(Boolean ropaDeTrabajo) {
        this.ropaDeTrabajo = ropaDeTrabajo;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Boolean getProtecciónVisual() {
        return protecciónVisual;
    }

    public void setProtecciónVisual(Boolean protecciónVisual) {
        this.protecciónVisual = protecciónVisual;
    }

    public Boolean getProtecciónAuditiva() {
        return protecciónAuditiva;
    }

    public void setProtecciónAuditiva(Boolean protecciónAuditiva) {
        this.protecciónAuditiva = protecciónAuditiva;
    }

    public Boolean getZapatosDeSeguridad() {
        return zapatosDeSeguridad;
    }

    public void setZapatosDeSeguridad(Boolean zapatosDeSeguridad) {
        this.zapatosDeSeguridad = zapatosDeSeguridad;
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

    public void setCumpleProteccionPersonal(boolean b) {
        this.cumpleProteccionPersonal= b;
    }

    public void setCumpleHigieneDelAmbienteLaboral(boolean b) {
        this.cumpleHigieneDelAmbienteLaboral= b;
    }

    public void setCumpleSeguridadAmbiente(boolean b) {
        this.cumpleSeguridadAmbiente= b;

    }

    public void setCumplePuestoDeTrabajo(boolean b) {
        this.cumplePuestoDeTrabajo= b;
    }
}
