package src.main.java.fallas;
/**
 * Created by agu on 04/07/16.
 */


public class Puesto {
    private Operador operador;
    private Boolean operadorAprobado;
    private Maquina maquina;
    private Boolean maquinaAprobado;
    private Ambiente ambiente;
    private Boolean ambienteAprobado;

    public Puesto(Operador operador, Maquina maquina, Ambiente ambiente) {
        this.operador = operador;
        this.maquina = maquina;
        this.ambiente = ambiente;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public void setOperadorAprobado(Boolean estado) {
        operadorAprobado = estado;
    }

    public void setAmbienteAprobado(Boolean estado) {
        ambienteAprobado = estado;
    }

    public String getStatus() {
        String reporte = "";
        if (!operadorAprobado) {
            reporte = reporte + "Operador: No esta aprobada la proteccion personal";
        }

        return reporte;
    }
}
