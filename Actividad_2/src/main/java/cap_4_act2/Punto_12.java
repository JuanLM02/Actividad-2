/*
 Ejercicio resuelto Nº 12
Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas
semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden
de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando
no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo
que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes
datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora
normal de trabajo.

Algoritmo
INICIO
 LEA: NOM, NHT, VHN
 SI NHT > 40 ENTONCES
 HET = NHT - 40
    SI HET > 8 ENTONCES
        HEE8 = HET - 8
        SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN
     SINO
        SALARIO = 40 * VHN + HET * 2 * VHN
    FIN_SI
    SINO
        SALARIO = NHT * VHN
    FIN_SI
 ESCRIBA: “EL TRABAJADOR”, NOM, “DEVENGO: $”, SALARIO
FIN_INICIO 
 */
package cap_4_act2;

import java.util.Scanner;

public class Punto_12 {

    public static void main(String[] args) {
        /*
            NOM: Nombre del trabajador.
            NHT: Número de horas trabajadas.
            VHN: Valor hora normal trabajada.
            HET: Horas extras trabajadas.
            HEE8: Horas extras que exceden de 8.
            SALARIO: Pago total que recibe el trabajador
         */
        int NHT, VHN, HET, HEE8, SALARIO;
        String NOM;
        Scanner numero = new Scanner(System.in);
        Scanner letra = new Scanner(System.in);

        System.out.println("Ingrese Nombre");
        NOM = letra.nextLine();
        System.out.println("Ingrese número de horas trabajadas.");
        NHT = numero.nextInt();
        System.out.println("Ingrese valor hora normal trabajada");
        VHN = numero.nextInt();

        if (NHT > 40) {
            HET = NHT - 40;
            if (HET > 8) {
                HEE8 = HET - 8;
                SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
            } else {
                SALARIO = 40 * VHN + HET * 2 * VHN;
            }
        } else {
            SALARIO = NHT * VHN;
        }
        System.out.println("EL TRABAJADOR " + NOM + " DEVENGÓ: $ " + SALARIO);

    }
}
