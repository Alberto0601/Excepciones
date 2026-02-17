package PracticaExamen2;

public class DominioException extends Exception {

    public DominioException(){
        super("Dominio incorrecto mi rey");
    }

    public DominioException(String message) {

        super(message);
    }

    public DominioException(String message, Throwable cause){
        super(message,cause);
    }
}
