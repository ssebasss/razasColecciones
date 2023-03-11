import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPerros {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private String raza;

    public Perro crearPerro() {
        Perro perrito = new Perro();
        System.out.println("ingrese la raza");
        perrito.setRaza(sc.next());
        return perrito;
    }

    public ArrayList<String> listaPerrosRazas() {
        ArrayList<String> listaPerrosRazas = new ArrayList<>();
        boolean salir = false;
        do {
            listaPerrosRazas.add(crearPerro().getRaza());
            System.out.println("desea salir??");
            salir = sc.hasNext();
        } while (salir = sc.next().equalsIgnoreCase("no") ? true : false);

        mostrarLista(listaPerrosRazas);
        return listaPerrosRazas;
    }

    private void mostrarLista(ArrayList<String> listaPerrosRazas) {
        for (String x : listaPerrosRazas) {
            System.out.println(x);
        }
    }


    public ArrayList<String> eliminarXRazas(ArrayList<String> listaPerrosRazas) {
        Iterator<String> it = listaPerrosRazas.iterator();
        boolean encontro = false;
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase("caniche")) {
                it.remove();
                encontro = true;
            }/*else {
                System.out.println("no se halla en la lista");
            }*/
        }
        if (encontro = false) {
            System.out.println("no se halla en la lista");
        }
        mostrarLista(listaPerrosRazas);
        return listaPerrosRazas;
    }


}

