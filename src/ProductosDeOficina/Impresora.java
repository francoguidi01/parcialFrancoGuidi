package ProductosDeOficina;

import Interface.Oferta;

public class Impresora extends ProductoInformatico implements Oferta {
    private Integer impresionXMinuto;


    public Impresora() {
    }

    public Impresora(String nombre, Double precio, String nombreFabricante, Integer impresionXMinuto) {
        super(nombre, precio, nombreFabricante);
        this.impresionXMinuto = impresionXMinuto;
    }

    public Integer getImpresionXMinuto() {
        return impresionXMinuto;
    }

    public void setImpresionXMinuto(Integer impresionXMinuto) {
        this.impresionXMinuto = impresionXMinuto;
    }

    @Override
    public String toString() {
        return "Impresora: " +super.toString()  +
                " impresionXMinuto= " + impresionXMinuto;
    }

    @Override
    public Double descuento(Double porcentaje) {
        setPrecio(getPrecio()-(getPrecio()*porcentaje));
        return getPrecio();
    }
}
