import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ServicioPerros svp = new ServicioPerros();


        ArrayList<String> listaPerrosRazas = svp.listaPerrosRazas();

        System.out.println("");
        System.out.println("eliminar de acuerdo a la raza");
        svp.eliminarXRazas(listaPerrosRazas);


    }
}