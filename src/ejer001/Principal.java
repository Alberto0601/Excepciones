package ejer001;

public class Principal {
    static void main() {
        try {
            ComprobacionTelefono.comprobar("99967");
        } catch (TelefonoException e) {//recibe la excepcion
            System.err.println(e.getMessage());//muestra el mensaje
        }

        try {
            ComprobacionTelefono.comprobar("887655122");

        } catch (TelefonoException e) {
            System.err.println(e.getMessage());
        }

        try {
            ComprobacionTelefono.comprobar("622558056");

        } catch (TelefonoException e) {
            System.err.println(e.getMessage());
        }
    }
}
