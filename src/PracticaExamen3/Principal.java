package PracticaExamen3;

public class Principal {
    static void main() {
        try {
            ComprobarMult.compMult3(7);
        } catch (NoMultException e) {
            System.err.println("Error, número " + e.getMessage());
        }

    }
}
