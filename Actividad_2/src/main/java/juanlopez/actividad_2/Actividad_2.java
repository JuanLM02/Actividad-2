package juanlopez.actividad_2;

/**
 * 18. Se tiene la siguiente información de un empleado: · código del empleado,
 * · nombres, · número de horas trabajadas al mes, · valor hora trabajada, ·
 * porcentaje de retención en la fuente. Haga un algoritmo que muestre: código,
 * nombres, salario bruto y salario neto.
 */
public class Actividad_2 {

    public static void main(String[] args) {
        String nombre = "Juan";
        float reten, sal_bru, fuent_reten, neto;
        int h = 48;
        int valor_h = 5000;

        String cog = "020827";
        reten = (float) (0.125);
        sal_bru = h * valor_h;
        fuent_reten = sal_bru * reten;
        neto = sal_bru - fuent_reten;

        System.out.println("Codigo de trabaj@r " + cog + "  Nombre: " + nombre);
        System.out.println("Salario bruto de " + nombre + " es $ " + sal_bru);
        System.out.println("Salario Neto es $ " + neto);
    }
}
