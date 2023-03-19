/*
21. Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro,
semiperímetro y el área del triángulo.
 */
package juanlopez.actividad_2;

import java.util.Scanner;

public class Punto_21 {
    public static void main(String[] args) {
        float a,b,c, perimet,s;
        
        Scanner numero = new Scanner(System.in);
        System.out.println("ingresa la medicion del PRIMER lado del triangulo");
        a = numero.nextFloat();
        System.out.println("ingresa la medicion del SEGUNDO lado del triangulo");
        b = numero.nextFloat();
        System.out.println("ingresa la medicion del TERCER lado del triangulo");
        c = numero.nextFloat();
        
        perimet = a+b+c ;
        s = perimet/2;
        
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        

        System.out.println("Su triángulo tiene las sigientes mediciones ");
        System.out.println("Perimetro = " + perimet +" metros");
        System.out.println("Semiperímetro = " + s +" metros");
        System.out.println("Área = " + String.format("%.2f", area) + " metros al cuadrado");
    }
}

