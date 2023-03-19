/*
Ejercicio resuelto Nº 10
Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los
siguientes datos:
• Número de inscripción
• Nombres
• Patrimonio.
• Estrato social.
La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio
es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3%
sobre el patrimonio. Hacer un algoritmo que muestre:
• Número de inscripción.
• Nombres.
• Pago de matrícula.

Algoritmo
INICIO
 LEA: NI, NOM, PAT, ES
 PAGMAT = 50000
 SI (PAT > 2000000) ∧ (ES > 3) ENTONCES
 PAGMAT = PAGMAT + 0.03 * PAT
 FIN_SI
 ESCRIBA: “EL ESTUDIANTE CON NUMERO DE INSCRIPCION”, NI,
 “Y NOMBRE”, NOM, “DEBE PAGAR: $”, PAGMAT
FIN_INICIO 
 */
package cap_4_act2;

import java.util.Scanner;

public class punto_10 {

    public static void main(String[] args) {
        /*
    NI: Número de inscripción.
    NOM: Nombres.
    PAT: Patrimonio.
    EST: Estrato social.
    PAGMAT: Pago por matrícula.
         */
        float PAT, ES, PAGMAT;
        String NOM, NI;

        Scanner numero = new Scanner(System.in);
        Scanner caracter = new Scanner(System.in);

        System.out.println("Ingrese su número de inscripción");
        NI = caracter.nextLine();
        System.out.println("Ingrese sus nombres");
        NOM = caracter.nextLine();
        System.out.println("Intgrese su patrimonio");
        PAT = numero.nextFloat();
        System.out.println("Ingrese su estrato social");
        ES = numero.nextFloat();

        PAGMAT = 50000;
        if ((PAT > 2000000) && (ES > 3)) {
            PAGMAT = (float) (PAGMAT + 0.03 * PAT);
        }

        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + NI + " Y NOMBRE " + NOM + " DEBE PAGAR: $ " + PAGMAT);

    }
}
