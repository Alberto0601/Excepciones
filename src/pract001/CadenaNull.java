package pract001;

public class CadenaNull {
    static void main() {

        try {//metes el cod que te interesa
            String s = null;
            System.out.println(s.length());
        }catch (NullPointerException e){
            System.out.println("Error: objeto null");
        }catch (RuntimeException e){
            System.out.println("Error en tiempo de ejecución");//Mas genérica que Null Pointer
        }catch (Exception e){
            System.out.println("Error general");//La más general
        }
    }
}
