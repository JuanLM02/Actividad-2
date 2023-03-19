/*
 22. Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
    número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
    de $450.000, de lo contrario escriba sólo el nombre. 
 */
package cap_4_act2;

import java.util.Scanner;

public class Punto_22 {
    
     public static void main(String[] args) {
          /*
         nombre : nombre de un empleado
         valor_h : su salario básico por hora
         h : número de horas trabajadas en el mes
         */
        String nombre;
        int h, valor_h, neto ;
        
        Scanner numero = new Scanner(System.in);
        Scanner letra = new Scanner(System.in);
        
        System.out.println("Intgrese nombre del empleado");
        nombre = letra.nextLine();
        System.out.println("Intgrese su salario básico por hora");
        valor_h = numero.nextInt();
        System.out.println("Intgrese número de horas trabajadas en el mes");
        h = numero.nextInt();
        
        neto = h*valor_h;
        if (neto>450000){
            System.out.println(nombre+" $ "+ neto);
        }
        else{
            System.out.println(nombre);
        }
        
    }
}
