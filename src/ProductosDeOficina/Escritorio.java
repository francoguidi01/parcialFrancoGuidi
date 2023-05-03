package ProductosDeOficina;

public class Escritorio extends Mueble{
    private Double alto;
    private Double ancho;

    public Escritorio() {
    }

    public Escritorio(String nombre, Double precio, Double alto, Double ancho) {
        super(nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorio: " + super.toString()+
                " alto= " + alto +
                ", ancho= " + ancho;
    }
}
