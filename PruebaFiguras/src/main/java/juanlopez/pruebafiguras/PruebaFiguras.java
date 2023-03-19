/*
Enunciado: clases sobre figuras geométricas
Se requiere un programa que modele varias figuras geométricas: el círculo, 
el rectángulo, el cuadrado y el triángulo rectángulo.
- El círculo tiene como atributo su radio en centímetros.
- El rectángulo, su base y altura en centímetros.
- El cuadrado, la longitud de sus lados en centímetros.
- El triángulo, su base y altura en centímetros.
Se requieren métodos para determinar el área y el perímetro de cada 
figura geométrica. Además, para el triángulo rectángulo se requiere:
- Un método que calcule la hipotenusa del rectángulo.
- Un método para determinar qué tipo de triángulo es:
Equilátero: todos sus lados son iguales.
Isósceles: tiene dos lados iguales.
Escaleno: todos sus lados son diferentes.
Se debe desarrollar una clase de prueba con un método main para 
crear las cuatro figuras y probar los métodos respectivos.
*/

package juanlopez.pruebafiguras;

public class PruebaFiguras {

    public static void main(String args[]) {
        
    Circulo figura1 = new Circulo(2);
    Rectangulo figura2 = new Rectangulo(1,2);
    Cuadrado figura3 = new Cuadrado(3);
    TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
    
    System.out.println("El área del círculo es = " + figura1.calcularArea());
    System.out.println("El perímetro del círculo es = "  + figura1.calcularPerimetro());
    System.out.println();
    
    System.out.println("El área del rectángulo es = " + figura2.calcularArea());
    System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
    System.out.println();
    
    System.out.println("El área del cuadrado es = " + figura3.calcularArea());
    System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
    System.out.println();
    
    System.out.println("El área del triángulo es = " + figura4.calcularArea());
    System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
    figura4.determinarTipoTriangulo();
}
}
