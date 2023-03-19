/*
19. Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
perímetro, el valor de la altura y el área del triángulo. 
 */
package juanlopez.actividad_2;

import java.util.Scanner;

public class Punto_19 {

    public static void main(String[] args) {
        float l, perimet,b;
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese la medición en metros de un lado de su triángulo equilátero");
        l = numero.nextFloat();
        b=(l/2);
        double alto = Math.sqrt((Math.pow(l, 2)) - (Math.pow(b, 2)));
        double area = Math.sqrt(3)/4*(Math.pow(l, 2));
        perimet = (3 * l);

        System.out.println("Su triángulo equilátero tiene las sigientes mediciones ");
        System.out.println("Perimetro = " + perimet +" metros");
        System.out.println("Altura = " + String.format("%.2f", alto) + " metros");
        System.out.println("Área = " + String.format("%.2f", area) + " metros al cuadrado");

    }
}




