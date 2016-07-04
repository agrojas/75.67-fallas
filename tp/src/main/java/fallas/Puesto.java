package fallas;

/**
 * Created by agu on 04/07/16.
 */
public class Puesto {
    private Operador operador;
    private Maquina maquina;
    private Ambiente ambiente;

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
}
