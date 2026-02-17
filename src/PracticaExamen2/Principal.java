package PracticaExamen2;

public class Principal {
    static void main() {
        try {
            ComprobDominio.comprobarDominio("dominio.es");
        }catch (DominioException|DominioCHException e){ //multicatch
            System.err.println("Error "+ e.getMessage());
        }

    }
}
