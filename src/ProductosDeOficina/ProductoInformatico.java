package ProductosDeOficina;

public abstract class ProductoInformatico extends ProductoOficina{
    private String nombreFabricante;

    public ProductoInformatico() {
    }

    public ProductoInformatico(String nombre, Double precio, String nombreFabricante) {
        super(nombre, precio);
        this.nombreFabricante = nombreFabricante;
    }

    @Override
    public String toString() {
        return "ProductoInformatico: " +
                "nombreFabricante= " + nombreFabricante + super.toString();
    }
}
