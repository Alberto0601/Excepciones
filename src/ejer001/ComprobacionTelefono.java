package ejer001;

public class ComprobacionTelefono {
    public static void comprobar(String num) throws TelefonoException {//hacer un metodo con las comprobaciones

        if (num.length() != 9) {
            throw new TelefonoException();//"Número no valido, no tiene un tamaño valido " + num esto para que salga así y si no pues se lanza el por defecto
        }

        if (num.charAt(0) != '6' && num.charAt(0) != '7' && num.charAt(0) != '9') {
            throw new TelefonoException("Comienzo de número de telefono no valido debe de empezar por 6,7 o 9 " + num);
        }

    }
}
