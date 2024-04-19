import java.util.ArrayList;
import java.util.List;

public class ListaCategoriaArticulos {
    private List<CategoriaArticulo> categoriaArticuloList;

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
}
