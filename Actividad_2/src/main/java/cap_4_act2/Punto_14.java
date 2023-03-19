/*
Ejercicio resuelto Nº 14
Una empresa con tres departamentos tiene establecido un plan de incentivos para sus
vendedores. Al final del período, a cada departamento se le pide el importe global de las
ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al
salario de los vendedores un porcentaje equivalente al 20% del salario mensual. Las
nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos:
• Ventas del departamento 1
• Ventas del departamento 2
• Ventas del departamento 3
• Salario de los vendedores de cada departamento
Hacer un algoritmo que determine cuánto recibirán los vendedores de cada departamento
al finalizar el período. 

INICIO
 LEA: VD1, VD2, VD3, SALAR
 TOTVEN = VD1 + VD2 + VD3
 PORVEN = 0.33 * TOTVEN
 SI VD1 > PORVEN ENTONCES
 SALAR1 = SALAR + 0.2 * SALAR
    SINO
    SALAR1 = SALAR
 FIN_SI
 SI VD2 > PORVEN ENTONCES
 SALAR2 = SALAR + 0.2 * SALAR
    SINO
    SALAR2 = SALAR
 FIN_SI
 SI VD3 > PORVEN ENTONCES
 SALAR3 = SALAR + 0.2 * SALAR
    SINO
    SALAR3 = SALAR
 FIN_SI
 ESCRIBA: “SALARIO VENDEDORES DEPTO. 1”, SALAR1,
 “SALARIO VENDEDORES DEPTO. 2”, SALAR2, “SALARIO
 VENDEDORES DEPTO. 3”, SALAR3
FIN_INICIO 
 */
package cap_4_act2;

import java.util.Scanner;

public class Punto_14 {

    public static void main(String[] args) {
        /*
                Definición de variables
        VD1: Ventas del departamento 1
        VD2: Ventas del departamento 2
        VD3: Ventas del departamento 3
        SALAR: Salario que reciben vendedores en cada departamento.
        TOTVEN: Total ventas en la empresa.
        PORVEN: Porcentaje equivalente al 33% de ventas totales.
        SALAR1: Salario de los vendedores en el depto. 1
        SALAR2: Salario de los vendedores en el depto. 2
        SALAR3: Salario de los vendedores en el depto. 3
         */
        float VD1, VD2, VD3, SALAR, TOTVEN, PORVEN, SALAR1, SALAR2, SALAR3;

        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese Ventas del departamento 1");
        VD1 = numero.nextFloat();
        System.out.println("Ingrese Ventas del departamento 2");
        VD2 = numero.nextFloat();
        System.out.println("Ingrese Ventas del departamento 3");
        VD3 = numero.nextFloat();
        System.out.println("Ingrese Salario que reciben vendedores en cada departamento");
        SALAR = numero.nextFloat();

        TOTVEN = VD1 + VD2 + VD3;
        PORVEN = (float) (0.33 * TOTVEN);

        if (VD1 > PORVEN) {
            SALAR1 = (float) (SALAR + 0.2 * SALAR);
        } else {
            SALAR1 = SALAR;
        }

        if (VD2 > PORVEN) {
            SALAR2 = (float) (SALAR + 0.2 * SALAR);
        } else {
            SALAR2 = SALAR;
        }

        if (VD3 > PORVEN) {
            SALAR3 = (float) (SALAR + 0.2 * SALAR);
        } else {
            SALAR3 = SALAR;
        }

        System.out.println("SALARIO VENDEDORES DEPTO. 1 $ " + SALAR1);
        System.out.println("SALARIO VENDEDORES DEPTO. 2 $ " + SALAR2);
        System.out.println("SALARIO VENDEDORES DEPTO. 3 $ " + SALAR3);
    }
}
