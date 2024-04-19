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
    public void imprimir(){
        for (Venta venta:ventaList ) {
            System.out.println("Codigo: " + venta.getCodigo());
            System.out.println("Codigo Articulo: " + venta.getCodigoArticulo());
            System.out.println("Cantidad: " + venta.getCantidad());

        }
    }

    public void addVentaToList(Venta venta){

        this.ventaList.add(venta);
    }
}