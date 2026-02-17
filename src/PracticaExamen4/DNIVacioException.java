package PracticaExamen4;

public class DNIVacioException extends RuntimeException {

    public DNIVacioException(){
        super("DNI vacio");
    }

    public DNIVacioException(String message) {

        super(message);
    }

    public DNIVacioException(String message, Throwable cause){
        super(message, cause);
    }
}
