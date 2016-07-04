package fallas;
/**
 * Created by agu on 25/06/16.
 */
import org.drools.RuleBase;
import org.drools.WorkingMemory;
import org.drools.RuleBaseFactory;
import org.drools.compiler.DroolsError;
import org.drools.compiler.DroolsParserException;
import org.drools.compiler.PackageBuilder;
import org.drools.compiler.PackageBuilderErrors;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Tp {
    public static void main(String[] args) {
        System.out.print("Hola");
        RuleBase ruleBase = null;
         try {
            
            PackageBuilder packageBuilder = readRuleFiles();
        // ruleBase = addRulesToWorkingMemory(packageBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DroolsParserException e) {
            e.printStackTrace();
        }
    }

    private static PackageBuilder readRuleFiles() throws DroolsParserException, IOException {
        PackageBuilder packageBuilder = new PackageBuilder();

        // String ruleFile = "rules.drl";
        // Reader reader = getRuleFileAsReader(ruleFile);
        // packageBuilder.addPackageFromDrl(reader);

        // assertNoRuleErrors(packageBuilder);

        return packageBuilder;
    }


    private static RuleBase addRulesToWorkingMemory(PackageBuilder packageBuilder) {
        RuleBase ruleBase = RuleBaseFactory.newRuleBase();
        org.drools.rule.Package rulesPackage = packageBuilder.getPackage();
        ruleBase.addPackage(rulesPackage);

        return ruleBase;
    }

}
