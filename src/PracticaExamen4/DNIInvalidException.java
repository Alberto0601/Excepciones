package PracticaExamen4;

public class DNIInvalidException extends RuntimeException { //hacerla que herede de exception

    public DNIInvalidException(){
        super("DNI no valido");
    }

    public DNIInvalidException(String message) {

        super(message);
    }

    public DNIInvalidException(String message, Throwable cause){
        super(message, cause); //constructor con mensaje y causa
    }
}
