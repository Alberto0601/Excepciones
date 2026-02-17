package PracticaExamen4;

import java.io.IOException;

public class ComprobarDNI {

    public static boolean dniVacio(String dni) throws DNIVacioException,DNIInvalidException{ //firmo que el metodo puede tirar estas 2
        if (dni.isEmpty()){
            throw new DNIVacioException();
        }
        String letra=dni.charAt(dni.length()-1)+"";
        dni=dni.replace(letra,"");

        String[] letrasDNI = {
                "T","R","W","A","G","M","Y","F","P","D",
                "X","B","N","J","Z","S","Q","V","H","L",
                "C","K","E"
        };

        if (!letrasDNI[Integer.parseInt(dni)%23].equals(letra)){
            throw new DNIInvalidException("NO SE NO VA",new IOException());//aqui esta lo que va a lanzar la causa (que son otras excepciones SIEMPRE)
        }

        return true;
    }
}
