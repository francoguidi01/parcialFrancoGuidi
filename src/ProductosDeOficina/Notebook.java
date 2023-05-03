package ProductosDeOficina;

public class Notebook extends ProductoInformatico{
    private Double memoria;

    public Notebook() {
    }

    public Notebook(String nombre, Double precio, String nombreFabricante, Double memoria) {
        super(nombre, precio, nombreFabricante);
        this.memoria = memoria;
    }

    public Double getMemoria() {
        return memoria;
    }

    public void setMemoria(Double memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook: " + super.toString() +
                "memoria= " + memoria ;
    }
}
