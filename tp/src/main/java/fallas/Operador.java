package fallas;

/**
 * Created by agu on 04/07/16.
 */
public class Operador {
    private Boolean zapatosDeSeguridad;
    private Boolean ropaDeTrabajo;
    private Integer antiguedad;
    private Boolean protecciónVisual;
    private Boolean protecciónAuditiva;

    public Operador(Boolean zapatosDeSeguridad, Boolean ropaDeTrabajo, Integer antiguedad, Boolean protecciónVisual, Boolean protecciónAuditiva) {
        this.zapatosDeSeguridad = zapatosDeSeguridad;
        this.ropaDeTrabajo = ropaDeTrabajo;
        this.antiguedad = antiguedad;
        this.protecciónVisual = protecciónVisual;
        this.protecciónAuditiva = protecciónAuditiva;
    }

    public Boolean getZapatosDeSeguridad() {
        return zapatosDeSeguridad;
    }

    public void setZapatosDeSeguridad(Boolean zapatosDeSeguridad) {
        this.zapatosDeSeguridad = zapatosDeSeguridad;
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
}
