package src.main.java.fallas;

import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.WorkingMemory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.compiler.*;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

import java.util.ArrayList;
import java.io.Reader;
import java.io.*;

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
        ArrayList<Puesto> puestos = new ArrayList<Puesto>();

        KnowledgeBase kbase = readKnowledgeBase();
        StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
///////////////////////////
// Forma gaston
/*        PackageBuilder packageBuilder = new PackageBuilder();
//        String ruleFile = "/home/bangho/IdeaProjects/mago-merlino/tp/src/main/resources/fallas/rules.drl";
//        String ruleFile = "../resources/fallas/rules.drl";
        String ruleFile = "rules.drl";
        Reader reader = new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(ruleFile));
        try {
            packageBuilder.addPackageFromDrl(reader);
        } catch (DroolsParserException droolsEr) {
            System.out.print("DroolsParserException");
        } catch (IOException err) {
            System.out.print(err.getLocalizedMessage());
        }

        assertNoRuleErrors(packageBuilder);
        RuleBase ruleBase = RuleBaseFactory.newRuleBase();
        org.drools.rule.Package rulesPackage = packageBuilder.getPackage();
        ruleBase.addPackage(rulesPackage);

        WorkingMemory workingMemory = ruleBase.newStatefulSession();
*/

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
            ksession.insert(puesto);
//            workingMemory.insert(puesto);
            puestos.add(puesto);
        }
        ksession.fireAllRules();
//        workingMemory.fireAllRules();

        for (Puesto puesto : puestos) {
            System.out.println("***************Resultado***************");
            System.out.println(puesto.getStatus());
        }
    }

    public void assertNoRuleErrors(PackageBuilder packageBuilder) {
        PackageBuilderErrors errors = packageBuilder.getErrors();

        if (errors.getErrors().length > 0) {
            StringBuilder errorMessages = new StringBuilder();
            errorMessages.append("Found errors in package builder\n");
            for (int i = 0; i < errors.getErrors().length; i++) {
                DroolsError errorMessage = errors.getErrors()[i];
                errorMessages.append(errorMessage);
                errorMessages.append("\n");
            }
            errorMessages.append("Could not parse knowledge");

            throw new IllegalArgumentException(errorMessages.toString());
        }
    }

    private static KnowledgeBase readKnowledgeBase() {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        String rulesFile = "/home/bangho/IdeaProjects/mago-merlino/tp/src/main/resources/fallas/rules.drl";
//        String rulesFile = "../resources/fallas/rules.drl";
//        String rulesFile = "rules.drl";

        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(rulesFile);
        if (is == null)
            System.out.print("input stream null");
        InputStreamReader isr = new InputStreamReader(is);
        kbuilder.add(ResourceFactory.newReaderResource(isr), ResourceType.DRL);
        if (kbuilder.hasErrors()) {
            for (KnowledgeBuilderError error : kbuilder.getErrors()) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Imposible crear knowledge con rules.drl");
        }
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
        return kbase;
    }
}
