package PracticaExamen;

import java.io.IOException;

public class ComprobCorreoElect {

    public static void compCorreo(String correo) throws CorreoElectException {
        if (!correo.contains("@")){//negar una condicion de un booleano
            throw new CorreoElectException();
        }
    }
}
