package encadenamientoExcepciones;

public class ProcesadorDatos {
    public int convertirTextoANumero(String texto) throws DatoInvalidoException {
        try {
            //intentamos convertir el texto a número
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            //Si falla, lanzamos nuestra excepción personalizada
            //y pasamos la NumberFormatException como causa
            throw new DatoInvalidoException(
                    "No se puedo convertir el texto a número: " + texto, e//<--Aquí pasamos la excepción original como causa
            );
        }
    }
}
