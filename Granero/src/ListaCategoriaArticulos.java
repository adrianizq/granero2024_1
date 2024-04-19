import java.util.ArrayList;
import java.util.List;

public class ListaCategoriaArticulos {
    private static List<CategoriaArticulo> categoriaArticuloList;

    public ListaCategoriaArticulos() {
        categoriaArticuloList = new ArrayList<>();
    }

    public ListaCategoriaArticulos(List<CategoriaArticulo> categoriaArticuloList) {
        this.categoriaArticuloList = categoriaArticuloList;
    }

    public List<CategoriaArticulo> getCategoriaArticuloList() {
        return categoriaArticuloList;
    }

    public void setCategoriaArticuloList(List<CategoriaArticulo> categoriaArticuloList) {
        this.categoriaArticuloList = categoriaArticuloList;
    }

    public void imprimir(){
        for (CategoriaArticulo categoriaArticulo:categoriaArticuloList ) {
            System.out.println("Codigo: " + categoriaArticulo.getCodigo());
            System.out.println("Nombre: " + categoriaArticulo.getNombre());
            System.out.println("Ganancia: " + categoriaArticulo.getGananacia());

        }
    }

    public void addCategoriaArticuloToList(CategoriaArticulo categoriaArticulo){

        this.categoriaArticuloList.add(categoriaArticulo);
    }

    //metodo  pasemos un articulo, y devuelva la categoria a la que pertenece
    public static CategoriaArticulo buscarCategoriaArticulo(Articulo articulo){
        for (CategoriaArticulo categoriaArticulo: categoriaArticuloList){
            if(articulo.getCategoria() == categoriaArticulo.getCodigo()){
                return  categoriaArticulo;
            }
        }
        return null;
    }
}
