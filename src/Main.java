import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Objeto>paraTienda=new ArrayList<>();
        Poscion poscionpoder=new Poscion(30.3, 2, "poscionVida", "Vida");
        Tienda mitienda=new Tienda("Mitienda", paraTienda);
        mitienda.mostrarDisponibles();
        System.out.println(mitienda.comprar(30.3, 1, 3, 0));


    }
}
