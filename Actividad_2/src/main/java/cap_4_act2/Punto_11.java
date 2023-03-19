/*
Ejercicio resuelto Nº 11
Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de
ellos.

Algoritmo
INICIO
 LEA: Nl, N2, N3
 SI (N1 > N2) ∧ (N1 > N3) ENTONCES
 MAYOR = N1
 SINO
    SI N2 > N3 ENTONCES
    MAYOR = N2
        SINO
        MAYOR = N3
    FIN_SI
 FIN_SI
 ESCRIBA: “EL VALOR MAYOR ENTRE: “, N1, “,”, N2, “Y”, N3, “ES:”, MAYOR
FIN_INICIO

 */
package cap_4_act2;

import java.util.Scanner;

public class Punto_11 {

    public static void main(String[] args) {
        /*
        N1: Valor del primer número a entrar.
        N2: Valor del segundo número.
        N3: Valor del tercer número.
        MAYOR: Variable que almacenará el valor mayor entre N1, N2 y N3.
         */
        int Nl, N2, N3, MAYOR;

        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese tres numeros número");

        Nl = numero.nextInt();
        N2 = numero.nextInt();
        N3 = numero.nextInt();

        if ((Nl > N2) && (Nl > N3)) {
            MAYOR = Nl;
        } else if (N2 > N3) {
            MAYOR = N2;
        } else {
            MAYOR = N3;
        }
        System.out.println("EL VALOR MAYOR ENTRE: " + Nl + ", " + N2 + " Y " + N3 + " ES: " + MAYOR);

    }
}
