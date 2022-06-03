import java.util.ArrayList;

public class Tienda {

    //Atributos
    //nombre- String
    //objetos disponibles-ArrayList<Objetos>

    private String nombre;
    private ArrayList<Objeto> objetosDisponibles;


    //metodo

    public boolean comprar(double dinero, int cantidad, int objeto, int indiceObjeto) {
        
        try {


            if (objetosDisponibles.get(indiceObjeto).cantidad >= cantidad) {
                double precioTotal = cantidad * objetosDisponibles.get(indiceObjeto).costo;
                if (dinero >= precioTotal) {
                    System.out.println("¡VENDIDO!🤩🛍️");
                    return true;
                } else {
                    System.out.println("Lo siento, no le alcanza, le hace falta: 💵" + (precioTotal - dinero));
                    return false;
                }
            } else {
                System.out.println("No tenemos la cantidad solicitada😔");
                return false;


            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("ese objeto no existe");
            return false;
        }
        //validar que hay sufucientes objetos del tipo requerido (¿?)
        //cantidad y objeto
        //Si si tengo, validar que el dinero sea suficiente
        //Sino
        //

    }

    //comprar
    //vender
    public boolean UsuarioVender(double dinero, int cantidad, Objeto objeto) {
        objeto.getClass();
        if (objeto.getClass().equals(Baya.class)) {

            return false;
        }
        return false;
    }



        public String getNombre () {
            return nombre;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public ArrayList<Objeto> getObjetosDisponibles () {
            return objetosDisponibles;
        }

        public void setObjetosDisponibles (ArrayList < Objeto > objetosDisponibles) {
            this.objetosDisponibles = objetosDisponibles;
        }

    public Tienda(String nombre, ArrayList < Objeto > objetosDisponibles) {
            this.nombre = nombre;
            this.objetosDisponibles = objetosDisponibles;
        }


        public void mostrarDisponibles () {
            System.out.println("Los objetos disponibles son: ");
            int indice = 1;
            for (Objeto x : objetosDisponibles) {
                System.out.print(indice + " - ");
                System.out.println(x);
                indice++;

            }
        }

    public void comprar(int i, int i1, int i2) {
    }
}


