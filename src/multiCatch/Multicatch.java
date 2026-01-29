package multiCatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Multicatch {//multicatch es para excepciones diferentes
    static void main() {
        try {
            String s=null;
            System.out.println(s.length());

            int[]numeros={1,2,3};
            System.out.println(numeros[5]);

            Path archivo= Paths.get("no_existe.txt");
            Files.readAllBytes(archivo);
        }catch (NullPointerException| ArrayIndexOutOfBoundsException e){
            System.err.println("Error de acceso de datos: "+ e.getMessage());
        }catch (IOException e){
            System.err.println("Error de entrada/salida: "+ e.getMessage());
        }catch (Exception e){
            System.err.println("Error inesperado: "+ e.getMessage());
        }
    }
}
