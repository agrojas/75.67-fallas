package fallas;


/**
 * Created by agu on 25/06/16.
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de  verificación de cumplimiento de normas de " +
                "seguridad e higiene para el puesto de Operador de Guillotina");
        System.out.println("Ingrese la cantidad de puestos a verificar:");
        PuestoInput puestoInput = new PuestoInput();
        int number = puestoInput.getNumber();

        for (int i = 0; i < number; i++) {
            Puesto puesto = new Puesto();
            puestoInput.setNombre(puesto);
            puestoInput.setPuesto(puesto);
            puestoInput.setZapatosDeSeguridad(puesto);
            puestoInput.setRopaDeTrabajo(puesto);
            puestoInput.setAntiguedad(puesto);
            puestoInput.setProtecciónVisual(puesto);
            puestoInput.setProtecciónAuditiva(puesto);
            puestoInput.setDescargaATierra(puesto);
            puestoInput.setZonaDeRiesgo(puesto);
            puestoInput.setSensoresDeDeteccion(puesto);
            puestoInput.setDelimitadorDeAcceso(puesto);
            puestoInput.setComandoDeAccionADosManos(puesto);
            puestoInput.setNivelRuido(puesto);
            puestoInput.setNivelLuz(puesto);
            puestoInput.setDelimitacion(puesto);
            System.out.println("***************Resultado***************");
            System.out.println(puesto.getStatus());
        }
    }

}
