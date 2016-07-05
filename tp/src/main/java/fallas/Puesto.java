package fallas;

/**
 * Created by agu on 04/07/16.
 */
public class Puesto {
    private Operador operador;
    private Maquina maquina;
    private Ambiente ambiente;
    private String nombre;

    public Puesto(Operador operador, Maquina maquina, Ambiente ambiente, String nombre) {
        this.operador = operador;
        this.maquina = maquina;
        this.ambiente = ambiente;
        this.nombre = nombre;
    }

    public Puesto() {
        this.operador  = new Operador();
        this.maquina  = new Maquina();
        this.ambiente = new Ambiente();
        this.nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
