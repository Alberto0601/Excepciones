package ejer001;

public class TelefonoException extends Exception {

    public TelefonoException() {

        super("Número de teléfono no valido");//MENSAJE DE LA SUPER CLASE
    }

    public TelefonoException(String mensaje) {

        super(mensaje);//lo mismo de antes pero sin personalizar
    }

    public TelefonoException(String mensaje, Throwable causa) {

        super(mensaje, causa);//causa-->le puedes pasar el apartado concreto donde da el error
    }

}

