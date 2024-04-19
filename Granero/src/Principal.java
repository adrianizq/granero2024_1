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

        ListaCategoriaArticulos listaCategoriaArticulos = new ListaCategoriaArticulos();
        listaCategoriaArticulos.addCategoriaArticuloToList(new CategoriaArticulo("0A","Alimentos",0.1));
        listaCategoriaArticulos.addCategoriaArticuloToList(new CategoriaArticulo("0B","Aseo",0.15));
        //listaCategoriaArticulos.imprimir();



        ListaArticulos listaArticulos = new ListaArticulos();
        listaArticulos.addArticuloToList(new Articulo("01","Arroz","0A",500.0,2300.0));
        listaArticulos.addArticuloToList(new Articulo("02","Cafe","0A",300.0,2500.0));
        listaArticulos.addArticuloToList(new Articulo("03","Frijol","0A",400.0,3700.0));
        listaArticulos.addArticuloToList(new Articulo("04","Sal","0A",200.0,1000.0));
        listaArticulos.addArticuloToList(new Articulo("05","Jabon","0B",150.0,800.0));
        listaArticulos.addArticuloToList(new Articulo("06","Betun","0B",300.0,900.0));
        listaArticulos.addArticuloToList(new Articulo("07","Avena","0A",400.0,2800.0));
        listaArticulos.addArticuloToList(new Articulo("08","Trigo","0A",300.0,1800.0));
        listaArticulos.addArticuloToList(new Articulo("09","Panela","0A",200.0,1500.0));
        listaArticulos.addArticuloToList(new Articulo("10","Limpido","0B",300.0,1200.0));
        listaArticulos.imprimir();


        ListaVentas listaVentas = new ListaVentas();
        listaVentas.addVentaToList(new Venta("0-A","01",4.0));
        listaVentas.addVentaToList(new Venta("0-A","03",3.0));
        listaVentas.addVentaToList(new Venta("0-A","07",2.0));
        listaVentas.addVentaToList(new Venta("0-A","09",3.0));
        listaVentas.addVentaToList(new Venta("0-A","05",2.0));
        listaVentas.addVentaToList(new Venta("0-B","05",5.0));
        listaVentas.addVentaToList(new Venta("0-B","06",4.0));
        listaVentas.addVentaToList(new Venta("0-C","08",3.0));
        listaVentas.addVentaToList(new Venta("0-C","09",2.0));
        listaVentas.addVentaToList(new Venta("0-C","10",4.0));
        listaVentas.addVentaToList(new Venta("0-D","02",4.0));
        listaVentas.addVentaToList(new Venta("0-D","05",3.0));
        //listaVentas.imprimir();

    }
}
