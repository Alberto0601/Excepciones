package PracticaExamen2;

public class DominioCHException extends Exception {

    public DominioCHException(){
        super("No valido");
    }

    public DominioCHException(String message) {

        super(message);
    }

    public DominioCHException(String message, Throwable cause){
        super(message, cause);
    }
}
