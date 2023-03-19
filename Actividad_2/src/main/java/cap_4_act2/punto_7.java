/*
 Ejercicio resuelto Nº 7
Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo
si A es mayor, menor o igual a B.
Análisis
Datos de entrada
• Los valores de A y de B.
Datos de salida
• Un mensaje de acuerdo al valor de A y de B.
Proceso
Se compara A con B, sí:
A > B. Entonces se escribe el mensaje «A es mayor que B», si la condición es falsa se
pregunta sí:
A = B. Si ésta es verdadera se escribe el mensaje «A es igual que B», y si es falsa, por
defecto A es menor que B.
Algoritmo
INICIO
 LEA: A, B
 SI A > B ENTONCES
 ESCRIBA: «A ES MAYOR QUE B»
 SINO
 SI A = B ENTONCES
 ESCRIBA: «A ES IGUAL A B»
 SINO
 ESCRIBA: «A ES MENOR QUE B»
 FIN_SI
 FIN_SI
FIN_INICIO 
 */
package cap_4_act2;

import java.util.Scanner;

public class punto_7 {

    public static void main(String[] args) {
        float A, B;

        Scanner numero = new Scanner(System.in);
        System.out.println("ingresa numero A");
        A = numero.nextFloat();
        System.out.println("ingresa numero B");
        B = numero.nextFloat();

        if (A > B) {
            System.out.println("A ES MAYOR QUE B");
        } else if (B == A) {
            System.out.println("A ES IGUAL A B");
        } else {
            System.out.println("A ES MENOR QUE B");
        }

    }
}
