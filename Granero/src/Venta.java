public class Venta {
    //CodVenta CodArticulo 	cantidad
    private String codigo;
    private String codigoArticulo;
    private Double cantidad;

    public Venta() {
    }

    public Venta(String codigo, String codigoArticulo, Double cantidad) {
        this.codigo = codigo;
        this.codigoArticulo = codigoArticulo;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
}
