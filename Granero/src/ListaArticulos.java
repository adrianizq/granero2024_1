import java.util.ArrayList;
import java.util.List;

public class ListaArticulos {
    public List<Articulo> articuloList;

    public ListaArticulos() {
        articuloList = new ArrayList<>();
    }

    public ListaArticulos(List<Articulo> articuloList) {
        this.articuloList = articuloList;
    }

    public List<Articulo> getArticuloList() {
        return articuloList;
    }

    public void setArticuloList(List<Articulo> articuloList) {
        this.articuloList = articuloList;
    }

    public void imprimir(){
        for (Articulo articulo:articuloList ) {
            System.out.println("Codigo: " + articulo.getCodigo());
            System.out.println("Nombre: " + articulo.getNombre());
            System.out.println("Categoria: " + articulo.getCategoria());
            System.out.println("Cantidad: " + articulo.getCantidad());
            System.out.println("Valor Compra: " + articulo.getValorCompra());
        }
    }

    //metodo para agregar articulo a la lista
    public void addArticuloToList(Articulo articulo){
        this.articuloList.add(articulo);
    }


}
