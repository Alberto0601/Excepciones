package PracticaExamen;

public class CorreoElectException extends Exception {

    public CorreoElectException(){
        super("Correo electrónico no válido");
    }

    public CorreoElectException(String message) {

        super(message);
    }

    public CorreoElectException(String message, Throwable cause){
        super(message, cause);

    }
}
