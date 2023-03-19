/*
 24. Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine cuál es
        la esfera de mayor peso. 
 */
package cap_4_act2;

import java.util.Scanner;

public class Punto_24 {
    public static void main(String[] args) {

        float A, B, C;

        Scanner numero = new Scanner(System.in);

        System.out.println("Intgrese peso A");
        A = numero.nextFloat();
        System.out.println("Intgrese peso B");
        B = numero.nextFloat();
        System.out.println("Intgrese peso C");
        C = numero.nextFloat();
        
        if ((A>B) && (A>C)){
            System.out.println("la esfera de mayor peso es A");
        } 
        else if ((A<B) && (B>C)){
            System.out.println("la esfera de mayor peso es B");
        }
        else {
            System.out.println("la esfera de mayor peso es C");
        }
    }
}
