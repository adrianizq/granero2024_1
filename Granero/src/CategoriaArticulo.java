public class CategoriaArticulo {
    private String codigo;
    private String nombre;
    private Double gananacia;

    public CategoriaArticulo() {
    }

    public CategoriaArticulo(String codigo, String nombre, Double gananacia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.gananacia = gananacia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getGananacia() {
        return gananacia;
    }

    public void setGananacia(Double gananacia) {
        this.gananacia = gananacia;
    }
}
