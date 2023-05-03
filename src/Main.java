import ProductosDeOficina.Escritorio;
import ProductosDeOficina.Impresora;
import ProductosDeOficina.Notebook;
import ProductosDeOficina.Silla;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola");

        //punto 1

        Silla silla1 = new Silla("Silla gamer", (double)1000, true);
        Silla silla2 = new Silla("Banquete", (double)5000, false);
        Escritorio escritorio1 = new Escritorio("Nordico", (double)2000, (double)30, (double)40);
        Impresora impresora1= new Impresora("HP-5000", (double)3000,"Sony", 7);
        Notebook notebook1 = new Notebook("LG-Macro", (double)4000,"Toshiba",(double)8);

        //punto 2 esta en las clases

        // punto 3

        ListaDeProductos listita = new ListaDeProductos();

        listita.agregar(silla1);
        listita.agregar(silla2);
        listita.agregar(escritorio1);
        listita.agregar(impresora1);
        listita.agregar(notebook1);
        listita.mostrarTodo();

        //punto 4

        System.out.printf("\nEl nuevo precio de la silla luego de aplicar el descuento es: "+ silla1.descuento(0.25)+"\n");
        System.out.printf("El nuevo precio de la impresora luego de aplicar el descuento es: "+ impresora1.descuento(0.35)+"\n");

        //punto 5
        listita.recalcularPrecio();

    }
}