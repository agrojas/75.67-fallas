package fallas;


import org.drools.RuleBase;
import org.drools.WorkingMemory;
import org.drools.compiler.DroolsParserException;

import java.io.IOException;

/**
 * Created by agu on 25/06/16.
 */

public class Main {
    public static void main(String[] args) {


        RuleManager ruleManager = new RuleManager();
        RuleBase ruleBase = null;
        Puesto puesto = new Puesto();
        try {
            ruleBase = ruleManager.initialiseDrools();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DroolsParserException e) {
            e.printStackTrace();
        }
        ruleManager.setPuesto(puesto);
        WorkingMemory workingMemory;


        System.out.println("Sistema de  verificación de cumplimiento de normas de " +
                "seguridad e higiene para el puesto de Operador de Guillotina");


        System.out.println("Ingrese la cantidad de puestos a verificar: ");



        PuestoInput puestoInput = new PuestoInput();
        int number = puestoInput.getNumber();



        for (int i = 0; i < number; i++) {
//            puesto = new Puesto();
            puestoInput.setPuesto(puesto);
            puestoInput.setNombre(puesto);
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

            workingMemory = ruleManager.initializeMessageObjects(ruleBase);
            int actualNumberOfRulesFired = workingMemory.fireAllRules();
            System.out.println("***************Resultado***************");
            System.out.println(puesto.getStatus());
//            if (actualNumberOfRulesFired < 1) {
//                mole.showDiagnoses("lunar sin diagnostico");
//            }

        }

    }


}
