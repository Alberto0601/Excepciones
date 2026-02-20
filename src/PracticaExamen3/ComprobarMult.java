package PracticaExamen3;

import java.io.IOError;
import java.io.IOException;

public class ComprobarMult {
    public static void compMult3(int num) throws NoMultException {
        if (num % 3 != 0) {
            throw new NoMultException("FDSFAF");
        }
    }
}
