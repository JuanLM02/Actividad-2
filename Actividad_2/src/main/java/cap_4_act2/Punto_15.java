/*
 Ejercicio resuelto Nº 15
Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una
diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor
o menor peso. 
Algoritmo
INICIO
 LEA: PESOA, PESOB, PESOC, PESOD
 SI (PESOA = PESOB) ∧ (PESOA = PESOC) ENTONCES
    SI PESOD > PESOA ENTONCES
        ESCRIBA: “LA ESFERA D ES LA DIFERENTE Y
      SINO
          ESCRIBA: “LA ESFERA D ES LA DIFERENTE Y
 FIN_SI
 SINO
    SI (PESOA = PESOB) ∧ (PESOA = PESOD) ENTONCES
        ESCRIBA: “LA ESFERA C ES LA DIFERENTE”
        SI PESOC > PESOA ENTONCES
            ESCRIBA: “Y ES DE MAYOR PESO”
          SINO
              ESCRIBA:”Y ES DE MENOR PESO”
 FIN_SI
 SINO
    SI (PESOA = PESOC) ∧ (PESOA = PESOD) ENTONCES
        ESCRIBA: “LA ESFERA B ES LA DIFERENTE”
        SI PESOB > PESOD ENTONCES
            ESCRIBA: “Y ES DE MAYOR PESO”
          SINO
              ESCRIBA: “Y ES DE MENOR PESO”
        FIN_SI
      SINO
        ESCRIBA: “LA ESFERA A ES LA DIFERENTE”
        SI PESOA > PESOB ENTONCES
            ESCRIBA: “Y ES DE MAYOR PESO”
        SINO
            ESCRIBA: “Y ES DE MENOR PESO”
 FIN_SI
 FIN_SI
 FIN_SI
 FIN_SI
FIN_INICIO 
 */
package cap_4_act2;

import java.util.Scanner;

/**
 *
 * @author juanc
 */
public class Punto_15 {

    public static void main(String[] args) {
        /*
            Definición de variables
        PESOA: Peso de la esfera A
        PESOB: Peso de la esfera B
        PESOC: Peso de la esfera C
        PESOD: Peso de la esfera D
         */
        float PESOA, PESOB, PESOC, PESOD;

        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese Peso de la esfera A");
        PESOA = numero.nextFloat();
        System.out.println("Ingrese Peso de la esfera B");
        PESOB = numero.nextFloat();
        System.out.println("Ingrese Peso de la esfera C");
        PESOC = numero.nextFloat();
        System.out.println("Ingrese Peso de la esfera D");
        PESOD = numero.nextFloat();

        if ((PESOA == PESOB) && (PESOC == PESOA)) {
            System.out.println("LA ESFERA D ES LA DIFERENTE");
            if (PESOD > PESOA) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else if ((PESOA == PESOB) && (PESOA == PESOD)) {
            System.out.println("LA ESFERA C ES LA DIFERENTE");
            if (PESOC > PESOA) {
                System.out.println(" Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else if ((PESOA == PESOC) && (PESOA == PESOD)) {
            System.out.println("LA ESFERA B ES LA DIFERENTE");
            if (PESOB > PESOD) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else {
            System.out.println("LA ESFERA A ES LA DIFERENTE");
            if (PESOA > PESOB) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        }
    }
}
