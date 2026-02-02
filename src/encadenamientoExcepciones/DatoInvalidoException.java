package encadenamientoExcepciones;

public class DatoInvalidoException extends Exception {

    public DatoInvalidoException(String mensaje) {
        super(mensaje);
    }

    //constructor con mensaje y causa
    //La causa es la excepción que ocurrió originalmente
    public DatoInvalidoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
