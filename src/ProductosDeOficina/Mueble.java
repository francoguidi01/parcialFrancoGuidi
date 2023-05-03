package ProductosDeOficina;

public abstract class Mueble extends ProductoOficina{
    public Mueble() {
    }

    public Mueble(String nombre, Double precio) {
        super(nombre, precio);
    }

    @Override
    public String toString() {
        return "Mueble:" + super.toString();
    }
}
