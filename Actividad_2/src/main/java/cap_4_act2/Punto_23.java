/*
23. Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación. 
 */
package cap_4_act2;

import java.util.Scanner;

public class Punto_23 {

    public static void main(String[] args) {

        float A, B, C;

        Scanner numero = new Scanner(System.in);

        System.out.println("Intgrese valor A");
        A = numero.nextFloat();
        System.out.println("Intgrese valor B");
        B = numero.nextFloat();
        System.out.println("Intgrese valor C");
        C = numero.nextFloat();
        float discri = (float) ((Math.pow(B, 2)) - (4 * A * C));
        float discriRaiz = (float) (double) Math.sqrt(discri);
        float x1 = ((-1*B + discriRaiz) / (2 * A));
        float x2 = ((-1*B - discriRaiz) / (2 * A));
        System.out.println(discri +" discrimiante");
        System.out.println(discriRaiz +" discrimianteraiz");
        if (discri < 0) {
            System.out.println("ecuación no posee soluciones reales");
        } else {
            System.out.println("las soluciones son: x1= " + x1 + " x2= " + x2);
        }
    }

}
