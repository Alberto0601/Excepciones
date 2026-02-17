package PracticaExamen2;

public class ComprobDominio {
    public static void comprobarDominio(String dominio) throws DominioException,DominioCHException{

        if (dominio.endsWith(".cn")){
            throw new DominioCHException("NADA DE SUCIOS CHINOS COMUNISTAS COMO EL MORO");
        }

        if (!dominio.endsWith(".com")&& !dominio.endsWith(".es")){
            throw new DominioException();
        }

    }
}
