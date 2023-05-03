package ProductosDeOficina;

public abstract class ProductoOficina {
    private static Integer stock = 0;
    private String nombre;
    private Double precio;

    public ProductoOficina() {
    stock++;
    }

    public ProductoOficina(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        stock++;
    }

    public static Integer getStock() {
        return stock;
    }

    public static void setStock(Integer stock) {
        ProductoOficina.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return " nombre= " + nombre +
                ", precio= " + precio;
    }
}
