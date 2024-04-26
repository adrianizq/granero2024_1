import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ListaVentas {
    List<Venta> ventaList;

    public ListaVentas() {
        ventaList = new ArrayList<>();
    }

    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }
    public void imprimir() {
        double sumaVenta=0.0;

        String codigoVentaActual;
        //obtener el codigo de la primera venta de ventaList
        codigoVentaActual = ventaList.get(0).getCodigo();

        for (Venta venta : ventaList) {

            Articulo articulo = new Articulo();
            articulo = ListaArticulos.buscarArticulo(venta.getCodigoArticulo());
            CategoriaArticulo categoriaArticulo = new CategoriaArticulo();
            categoriaArticulo =
                    ListaCategoriaArticulos.buscarCategoriaArticulo(articulo);
            Double precioVenta =  articulo.getValorCompra() * (1 + categoriaArticulo.getGananacia());
            System.out.println("Codigo: " + venta.getCodigo());
            System.out.println("Codigo Articulo: " + venta.getCodigoArticulo());
            System.out.println("Cantidad: " + venta.getCantidad());
            //imprimir el nombre del articulo
            //creemos un objeto de tipo articulo temporal

            System.out.println("Nombre Articulo: " + articulo.getNombre());
            System.out.println("Valor de Compra: " + articulo.getValorCompra());
            //Encontrar la ganancia, pero la ganancia esta en
            // la listaCategoriaArticulo
            //Crear una categoriaArticulo

            System.out.println("Ganancia: " + categoriaArticulo.getGananacia());

            // Creamos un objeto DecimalFormat con el patrón deseado
            DecimalFormat df = new DecimalFormat("#.#");

            // Formateamos el número utilizando el objeto DecimalFormat
            String precioVentaForm = df.format(precioVenta);
            System.out.println("Precio Venta: " + precioVentaForm);

            Double subTotal = precioVenta * venta.getCantidad();

            String subTotalForm = df.format(subTotal);
            System.out.println("SubTotal: " + subTotalForm);
            System.out.println("");


            if (codigoVentaActual == venta.getCodigo()){

                sumaVenta+= subTotal;
                System.out.println("Suma Venta --->=" + sumaVenta);
            }
            else{

                sumaVenta=subTotal;
                codigoVentaActual= venta.getCodigo();
                System.out.println("Suma Venta --->=" + sumaVenta);
            }

        }
    }
    public void addVentaToList(Venta venta){

        this.ventaList.add(venta);
    }
}
