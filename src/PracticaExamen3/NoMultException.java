package PracticaExamen3;

public class NoMultException extends Exception {

    public NoMultException(){
        super("NO valido");
    }

    public NoMultException(String message) {

        super(message);
    }

    public NoMultException(String message, Throwable cause){
        super(message,cause);
    }
}
