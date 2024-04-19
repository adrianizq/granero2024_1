import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //Articulo a1 = new Articulo("01","Arroz","0A",20.0,2000.0);
        //Articulo a2 = new Articulo("02","Harina","0A",30.0,2500.0);

        /* Cuando se quiera pasar la lista al constructor no vacio
        List<Articulo> lArt = new ArrayList();
        lArt.add(a1);
        lArt.add(a2);
        ListaArticulos listaArticulos = new ListaArticulos(lArt); */

        ListaArticulos listaArticulos = new ListaArticulos();
        listaArticulos.addArticuloToList(new Articulo("01","Arroz","0A",20.0,2000.0));
        listaArticulos.addArticuloToList(new Articulo("02","Harina","0A",30.0,2500.0));

        listaArticulos.imprimir();

    }
}
