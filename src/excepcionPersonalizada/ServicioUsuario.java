package excepcionPersonalizada;

public class ServicioUsuario {
    public void registrarUsuario(String nombre, int edad)
            throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa" + edad);//throw new para lanzar y throws para firmarlo
        }

        if (edad < 18) {
            throw new EdadInvalidaException("Debes ser mayor de 18 años. Tienes: " + edad);
        }

        if (edad > 120) {
            throw new EdadInvalidaException();
        }
    }

}
