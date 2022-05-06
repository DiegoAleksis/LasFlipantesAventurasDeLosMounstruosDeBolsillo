import java.util.ArrayList;

public class Tienda {

    //Atributos
    //nombre- String
    //objetos disponibles-ArrayList<Objetos>

    private String nombre;
    private ArrayList<Objeto> objetosDisponibles;


    //metodo

    public boolean comprar(double dinero, int cantidad, Objeto objeto) {
        //validar que hay sufucientes objetos del tipo requerido (¿?)
        //cantidad y objeto
        //Si si tengo, validar que el dinero sea suficiente
        //Sino
        //


        System.out.println("Los objetos disponibles son: ");
        int indice=1;
        for (Objeto x :objetosDisponibles) {
            System.out.print(indice + " - " );
            System.out.println(x);
            indice++;
        }


        return false;
    }

    //comprar
    //vender
    public boolean UsuarioVender(double dinero, int cantidad, Objeto objeto) {


        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Objeto> getObjetosDisponibles() {
        return objetosDisponibles;
    }

    public void setObjetosDisponibles(ArrayList<Objeto> objetosDisponibles) {
        this.objetosDisponibles = objetosDisponibles;
    }

    public Tienda(String nombre, ArrayList<Objeto> objetosDisponibles) {
        this.nombre = nombre;
        this.objetosDisponibles = objetosDisponibles;
    }
}

