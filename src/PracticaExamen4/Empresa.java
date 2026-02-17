package PracticaExamen4;

import java.util.ArrayList;

public class Empresa {
    private ArrayList clientes;

    public Empresa(){
        this.clientes=new ArrayList<>();
    }

    public void addClientes(String nombre, String dni){

       if (ComprobarDNI.dniVacio(dni)){
           clientes.add(new Cliente(dni,nombre));
       }

    }
}
