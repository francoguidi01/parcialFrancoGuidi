package ProductosDeOficina;

import Interface.Oferta;

public class Silla extends Mueble implements Oferta {
    private Boolean ruedas;

    public Silla() {
    }

    public Silla(String nombre, Double precio, Boolean ruedas) {
        super(nombre, precio);
        this.ruedas = ruedas;
    }

    public Boolean getRuedas() {
        return ruedas;
    }

    public void setRuedas(Boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        if (this.ruedas==true) {
            return "Silla: " + super.toString() + ", Esta silla tiene ruedas";
        }
            return "Silla: " + super.toString() + ", Esta silla no tiene ruedas";
    }

    @Override
    public Double descuento(Double porcentaje) {
        setPrecio(getPrecio()-(getPrecio()*porcentaje));
        return getPrecio();
    }
}
