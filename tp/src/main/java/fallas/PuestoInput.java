package fallas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

/**
 * Created by agu on 04/07/16.
 */
public class PuestoInput {

    private Puesto puesto ;
    private static Integer numeroDePuesto = 0;

    public PuestoInput() {
        this.puesto = null;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
        PuestoInput.numeroDePuesto++;
    }

    public void setNombre(Puesto puesto) {
        String nombre = String.format(Locale.ENGLISH, "Puesto N° %d", PuestoInput.numeroDePuesto);
        this.puesto.setNombre(nombre);
    }

    public void setZapatosDeSeguridad(Puesto puesto) {
        boolean option;
        option = getBoolOption("El operario posee zapatos de seguridad? [S/N]: ");
        this.puesto.getOperador().setZapatosDeSeguridad(option);

    }

    public void setRopaDeTrabajo(Puesto puesto) {
        boolean option;
        option = getBoolOption("El operario posee ropa de trabajo? [S/N]: ");
        this.puesto.getOperador().setRopaDeTrabajo(option);
    }

    public void setAntiguedad(Puesto puesto) {
        Integer option;
        option = getIntegerOption("Antiguedad del operario (en meses): ");
        this.puesto.getOperador().setAntiguedad(option);
    }

    public void setProtecciónVisual(Puesto puesto) {
        boolean option;
        option = getBoolOption("El operario posee proteccion visual? [S/N]: ");
        this.puesto.getOperador().setProtecciónVisual(option);
    }

    public void setProtecciónAuditiva(Puesto puesto) {
        boolean option;
        option = getBoolOption("El operario posee proteccion auditiva? [S/N]: ");
        this.puesto.getOperador().setProtecciónAuditiva(option);
    }

    public void setDescargaATierra(Puesto puesto) {
        boolean option;
        option = getBoolOption("La maquina posee descarga a tierra? [S/N]: ");
        this.puesto.getMaquina().setDescargaATierra(option);
    }

    public void setZonaDeRiesgo(Puesto puesto) {
        boolean option;
        option = getBoolOption("La maquina posee delimitacion de zona de riesgo? [S/N]: ");
        this.puesto.getMaquina().setZonaDeRiesgo(option);
    }

    public void setSensoresDeDeteccion(Puesto puesto) {
        boolean option;
        option = getBoolOption("La maquina posee sensores de deteccion? [S/N]: ");
        this.puesto.getMaquina().setSensoresDeDeteccion(option);
    }

    public void setDelimitadorDeAcceso(Puesto puesto) {
        boolean option;
        option = getBoolOption("La maquina posee delimitador de acceso? [S/N]: ");
        this.puesto.getMaquina().setDelimitadorDeAcceso(option);
    }

    public void setComandoDeAccionADosManos(Puesto puesto) {
        boolean option;
        option = getBoolOption("La maquina posee comando de accion a dos manos? [S/N]: ");
        this.puesto.getMaquina().setComandoDeAccionADosManos(option);
    }

    public void setNivelRuido(Puesto puesto) {
        Double option;
        option = getDoubleOption("Decibeles de ruido del ambiente: ");
        this.puesto.getAmbiente().setNivelRuido(option);
    }

    public void setNivelLuz(Puesto puesto) {
        Double option;
        option = getDoubleOption("Decibeles de luz del ambiente: ");
        this.puesto.getAmbiente().setNivelLuz(option);
    }

    public void setDelimitacion(Puesto puesto) {
        boolean option;
        option = getBoolOption("La maquina posee delimitacion? [S/N]: ");
        this.puesto.getAmbiente().setDelimitacion(option);
    }

    private static String getStringOption(String message) {
        String option;
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        option = in.nextLine();
        while (!option.equals("1") && !option.equals("2")) {
            System.out.println("No es una opcion valida. Por favor ingrese '1' o '2'");
            option = in.nextLine();
        }
        return option;
    }

    private static Integer getIntegerOption(String message) {
        System.out.println(message);
        while (true) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String input = bufferedReader.readLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                System.out.println("No es un numero valido!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static Double getDoubleOption(String message) {
        System.out.println(message);
        while (true) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String input = bufferedReader.readLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException ex) {
                System.out.println("No es un numero valido!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getNumber(){
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        String line;
        while (true) {
            try {
                line = keyboard.readLine();
                if (line != null ) {
                    try {
                        return Integer.parseInt(line);
                    } catch (NumberFormatException ex) {
                        System.out.println("No es un numero valido!");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static Boolean getBoolOption(String message) {
        String option;
        System.out.print(message);
        Scanner in = new Scanner(System.in);
        option = in.nextLine();
        while (!option.equals("S") && !option.equals("N")) {
            System.out.println("No es una opcion valida. Por favor ingrese 'S' o 'N'");
            option = in.nextLine();
        }
        return option.equals("S");
    }
}
