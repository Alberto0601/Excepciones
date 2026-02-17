package PracticaExamen4;

public class Principal {
    static void main() {
        try {
            Empresa e1 = new Empresa();
            e1.addClientes("alvaro845", "342334561");
        } catch (DNIVacioException | DNIInvalidException e) { //multicatch
            System.err.println("Error " + e.getMessage());
            System.err.println(e.getCause());//EN ESTE EJEMPLO la causa es java.IOException
        }
    }
}
