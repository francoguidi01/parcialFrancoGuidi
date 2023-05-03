import ProductosDeOficina.*;

import java.util.ArrayList;

public class ListaDeProductos {
    private ArrayList<ProductoOficina> listaProductos;

    public ListaDeProductos() {
        this.listaProductos = new ArrayList<>();
    }

    public ListaDeProductos(ArrayList<ProductoOficina> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return "ListaDeProductos{" +
                "listaProductos=" + listaProductos +
                '}';
    }

    public void agregar (ProductoOficina p)
    {
        listaProductos.add(p);
    }

    public void mostrarTodo ()
    {
        for (ProductoOficina i : listaProductos) {
            System.out.println(i.toString());
        }
    }

    public void recalcularPrecio() {
        for (ProductoOficina i : listaProductos) {
            if (i instanceof Silla) {
                System.out.println("\nPrecio antes de silla= " + i.getPrecio());
                i.setPrecio(i.getPrecio()*1.05);
                System.out.println("Precio despues de silla = " + i.getPrecio());
            } else if (i instanceof Escritorio) {
                System.out.println("\nPrecio antes de escritorio = " + i.getPrecio());
                i.setPrecio(i.getPrecio()*1.1);
                System.out.println("Precio despues de escritorio = " + i.getPrecio());
            } else if (i instanceof Impresora) {
                System.out.println("\nPrecio antes de impresora = " + i.getPrecio());
                i.setPrecio(i.getPrecio()*1.15);
                System.out.println("Precio despues de impresora = " + i.getPrecio());
            } else if (i instanceof Notebook) {
                System.out.println("\nPrecio antes de notebook = " + i.getPrecio());
                i.setPrecio(i.getPrecio()*1.20);
                System.out.println("Precio despues de notebook = " + i.getPrecio());
            }
        }
    }
}
