package excepcionPersonalizada;

public class EdadInvalidaException extends Exception {

    public EdadInvalidaException(){
        super("La edad introducida no es válida");
    }
    public EdadInvalidaException(String mensaje){
        super(mensaje);//mensaje viene de Exception
    }

    public EdadInvalidaException(String mensaje, Throwable causa){
        super(mensaje,causa);
    }

}
