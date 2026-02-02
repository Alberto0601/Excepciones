package encadenamientoExcepciones;

public class Principal {
    static void main() {
        ProcesadorDatos procesador = new ProcesadorDatos();

        try {
            //intentamos convertir un texto inválido
            int numero = procesador.convertirTextoANumero("abc123");
            System.out.println("Número: " + numero);
        } catch (DatoInvalidoException e) {
            //Mostramos el mensaje de nuestra excepcion personalizada
            System.err.println("Error: " + e.getMessage());

            //Obtenemos y mostramos la causa original
            Throwable causa = e.getCause();//lo nuevo
            if (causa != null) {
                System.err.println("Causa: " + causa.getClass().getSimpleName());
                System.err.println("Detalle: " + causa.getMessage());
            }
        }
    }
}
