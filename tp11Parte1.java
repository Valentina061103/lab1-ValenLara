import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
public class tp11Parte1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ////////////////////////////////////////////////
        //1
        ArrayList<String> autos=new ArrayList<>();
        while(true){
            System.out.println("Ingrese una marca de auto(enter para salir)");
            String auto = scanner.nextLine();
            if (auto.equals("")) {
                break; // Sale del bucle si el usuario apreta 'enter'
            } else {
                autos.add(auto); // Agrega el dato a la ArrayList
            }
        }
        System.out.println("Los autos ingresados son:");
        for (String i : autos) {
            System.out.println(i);
        }
        /////////////////////////////////////////////////
        //2
        EquipoDeFutbol equipo = new EquipoDeFutbol("MiEquipo");
        while(true){
            System.out.println("Elija una opcion:(1)Agregar un jugador//(2)Eliminar un jugador//(3)Listar plantilla//(4)Salir");
            int opcion=scanner.nextInt();
            if(opcion==1){
                System.out.println("Ingrese un jugador");
                String jugador = scanner.next();
                equipo.agregarJugador(jugador);
            }else if(opcion==2){
                equipo.listarPlantilla();
                System.out.println("Escriba el nombre del jugador a eliminar (enter para salir)");
                String eliminar = scanner.next();
                equipo.eliminarJugador(eliminar);
            }else if(opcion==3){
                equipo.listarPlantilla();
            }else if(opcion==4){
                break;
            }
            
        }
        /////////////////////////////////////////////////
        //3
        Factura factura = new Factura(1234,new Date(),"Jose Fernandez");
        Articulo articulo1 = new Articulo("Producto1", 10.0, 2);
        Articulo articulo2 = new Articulo("Producto2", 15.0, 3);

        factura.agregarArticulo(articulo1);
        factura.agregarArticulo(articulo2);

        factura.calcularSubtotal();
        factura.calcularIVA(0.16); // Suponiendo un 16% de IVA
        factura.calcularTotal();

        factura.imprimirFactura();

        scanner.close();
}
}
/////////////////////////////////////////////////
//2
class EquipoDeFutbol{
    private String nombreEquipo;
    private ArrayList<String> plantilla;

    public EquipoDeFutbol(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.plantilla = new ArrayList<>();
    }

    // Agregar un nuevo jugador a la plantilla
    public void agregarJugador(String jugador) {
        plantilla.add(jugador);
        System.out.println(jugador + " ha sido agregado a la plantilla de " + nombreEquipo);
    }

    // Eliminar un jugador de la plantilla
    public void eliminarJugador(String jugador) {
        if (plantilla.contains(jugador)) {
            plantilla.remove(jugador);
            System.out.println(jugador + " ha sido eliminado de la plantilla de " + nombreEquipo);
        } else {
            System.out.println(jugador + " no se encuentra en la plantilla de " + nombreEquipo);
        }
    }

    // Listar la plantilla del equipo
    public void listarPlantilla() {
        System.out.println("Plantilla de " + nombreEquipo + ":");
        for (String jugador : plantilla) {
            System.out.println(jugador);
        }
    }
}
///////////////////////////////////////
//3
class Factura{
    private int nroFact;
    private Date fecha;
    private String cliente;
    private  ArrayList<Articulo> articulos;
    private double subtotal;
    private double iva;
    private double total;
    public Factura(int nroFact, Date fecha, String cliente){
        this.nroFact=nroFact;
        this.fecha=fecha;
        this.cliente=cliente;
        this.articulos= new ArrayList<>();
        this.subtotal=0.0;
        this.iva=0.0;
        this.total=0.0;

    }
    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    // Método para calcular el subtotal de la factura
    public void calcularSubtotal() {
        subtotal = 0.0;
        for (Articulo articulo : articulos) {
            subtotal += articulo.getPrecioUnitario() * articulo.getCantidad();
        }
    }

    // Método para calcular el IVA de la factura
    public void calcularIVA(double tasaIVA) {
        iva = subtotal * tasaIVA;
    }

    // Método para calcular el total de la factura
    public void calcularTotal() {
        total = subtotal + iva;
    }

    public void imprimirFactura() {
        System.out.println("Número de Factura: " + nroFact);
        System.out.println("Fecha de Emisión: " + fecha);
        System.out.println("Cliente: " + cliente);
        System.out.println("Artículos:");
        for (Articulo articulo : articulos) {
            System.out.println(articulo.getNombre() + " - Cantidad: " + articulo.getCantidad() + " - Precio Unitario: $" + articulo.getPrecioUnitario());
        }
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA: $" + iva);
        System.out.println("Total: $" + total);
    }

}
class Articulo {
    private String nombre;
    private double precioUnitario;
    private int cantidad;

    public Articulo(String nombre, double precioUnitario, int cantidad) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }
    /* */
}
