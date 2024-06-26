import java.util.ArrayList;
import java.util.List;

public class ListaArticulos {
    public static List<Articulo> articuloList;



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

            //crear un objeto categoriaArticulo temporal
            CategoriaArticulo categoriaArticulo =
                    ListaCategoriaArticulos.buscarCategoriaArticulo(articulo);
            //System.out.println("Cod Categoria : " + categoriaArticulo.getCodigo());
            //System.out.println("Cod Categoria : " + categoriaArticulo.getGananacia());
            Double valorVenta = articulo.getValorCompra() +
                    articulo.getValorCompra() * categoriaArticulo.getGananacia();
            System.out.println("Valor de Venta :" + valorVenta);

        }

    }

    //metodo para agregar articulo a la lista
    public void addArticuloToList(Articulo articulo){
        this.articuloList.add(articulo);
    }


    //buscar un articulo por el codigo
    //que debe retornar un objeto Articulo
    //que debo pasarle un String en el parametro

    public static Articulo buscarArticulo(String codigo){
        for (Articulo a: articuloList){
            if(codigo==a.getCodigo()){
                return a;
            }
        }
        return null;
    }

}
