package gestionDeScanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionScanner {
    static void main() {
        Scanner teclado;//declaras teclado
        try {
            teclado = new Scanner(System.in);//se instancia dentro
            int numero = teclado.nextInt();
            System.out.println("Has introducido " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir un número");
        } finally {//no se utiliza, pero puede preguntarlo lo que hace es cerrar recursos
            System.out.println("Este mensaje aparece siempre");
            //aqui se liberarian recursos
        }
        //diferencia entre finally y try with resources, solo se usa el resources
    }
}
