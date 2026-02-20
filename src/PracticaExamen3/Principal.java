package PracticaExamen3;

import java.rmi.ServerError;

public class Principal {
    static void main() {
        try {
            ComprobarMult.compMult3(7);
        } catch (NoMultException e) {
            System.err.println("Error, número " + e.getMessage());
        }

    }
}
