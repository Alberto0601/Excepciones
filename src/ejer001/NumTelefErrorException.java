package ejer001;

public class NumTelefErrorException extends Exception {

    public NumTelefErrorException() {
        super("Número de teléfono invalido");
    }

    public NumTelefErrorException(String mensaje) {
        super(mensaje);
    }

    public NumTelefErrorException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
