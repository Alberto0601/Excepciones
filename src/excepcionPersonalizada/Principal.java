package excepcionPersonalizada;

public class Principal {
    static void main() {

        ServicioUsuario servicio=new ServicioUsuario();
        //caso 1
        try{
            servicio.registrarUsuario("Ana Garcia",25);
        }catch (EdadInvalidaException e){
            System.err.println("Error al registrar usuario (Caso 1)"+ e.getMessage());//e siempre va con get mensage
        }
        //caso 2
        try{
            servicio.registrarUsuario("Juan Pérez",10);
        }catch (EdadInvalidaException e){
            System.err.println("Error al registrar usuario (Caso 2)"+ e.getMessage());
        }
        System.out.println("--------------------------------------");
        //caso 3
        try{
            servicio.registrarUsuario("Pedro Rodríguez",-5);
        }catch (EdadInvalidaException e){
            System.err.println("Error al registrar usuario (Caso 3)" + e.getMessage());
        }
        //caso 4
        try{
            servicio.registrarUsuario("Juanma Dominguez",180);
        }catch (EdadInvalidaException e){
            System.err.println("Error al registrar usuario (Caso 4)" + e.getMessage());
        }
    }
}
