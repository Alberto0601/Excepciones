package PracticaExamen;

public class Principal {
    static void main() {
        try {
            ComprobCorreoElect.compCorreo("mecagoenlemoro.com");
        }catch (CorreoElectException e){
            System.err.println("Error "+ e.getMessage());
        }
    }
}
