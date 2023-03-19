/*
 Ejercicio resuelto Nº 13
Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la
compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita
es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es
amarilla un 25%, si es azul un
50% y si es roja un 100%. Hacer un algoritmo para determinar la cantidad final que un
cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores
mencionados. 
INICIO
 LEA: VALCOMP, COLOR
 SI COLOR = “BLANCO” ENTONCES
 PDES=0
    SINO
        SI COLOR = “VERDE” ENTONCES
            PDES = 10
    SINO
        SI COLOR=”AMARILLO” ENTONCES
            PDES = 25
    SINO
        SI COLOR = “AZUL” ENTONCES
            PDES = 50
    SINO
    PDES = 100
 FIN_SI
 FIN_SI
 FIN_SI
 FIN_SI
 VALPAG = VALCOMP - PDES * VALCOMP / 100
 ESCRIBA : “ EL CLIENTE DEBE PAGAR:$”, VALPAG
FIN_INICIO
 */
package cap_4_act2;

import java.util.Scanner;

public class Punto_13 {

    public static void main(String[] args) {
        /*
        VALCOMP: Valor de la compra.
        COLOR: Color de la bolita.
        VALPAG: Valor a pagar.
        PDES: Porcentaje de descuento.
         */
        float VALCOMP, VALPAG, PDES;
        String COLOR;

        Scanner numero = new Scanner(System.in);
        Scanner caracter = new Scanner(System.in);

        System.out.println("Ingrese Valor de la compran");
        VALCOMP = numero.nextInt();
        System.out.println("Ingrese Color de la bolita");
        COLOR = caracter.nextLine();

        if ("BLANCO".equals(COLOR)) {
            PDES = 0;
        } else if ("VERDE".equals(COLOR)) {
            PDES = 10;
        } else if ("AMARILLO".equals(COLOR)) {
            PDES = 25;
        } else if ("AZUL".equals(COLOR)) {
            PDES = 50;
        } else {
            PDES = 100;
        }
        VALPAG = (VALCOMP - PDES * VALCOMP / 100);
        System.out.println("EL CLIENTE DEBE PAGAR:$ " + VALPAG);

    }
}
