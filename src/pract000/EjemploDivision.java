package pract000;

public class EjemploDivision {
    static void main() {
        int a = 10;
        int b = 0;

        try {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir entre cero");//para que aparezca en rojo
            System.out.println("Mensaje técnico " + e.getMessage());
        }

        System.out.println("El programa continúa");



    }
}
