import java.util.ArrayList;

public  class Main implements UtilInterface{
    static ArrayList<Habilidad> habilidads=new ArrayList<>();
    static Habilidad habilidad=new Habilidad("Patada voladora", "Patada cuando vuela",40);
    static Habilidad habilidad2=new Habilidad("Rayo frio","Congelacion de cuerpo completo", 50);
    static Habilidad habilidad3=new Habilidad("Puño de fuego","Puño que quema en gran porcion a su oponente", 60);
    static ArrayList<String> tiposPokemon;

    public static void main(String[] args) throws InterruptedException {

        habilidads.add(habilidad);
        habilidads.add(habilidad2);
        habilidads.add(habilidad3);







        long tiempoInicial=System.currentTimeMillis();
       Thread.sleep(20000);
       long fin=System.currentTimeMillis();
       double tiempoPresente=(double) ((fin-tiempoInicial)/1000);
        System.out.println(tiempoPresente +" segundos");


    }

    @Override
    public void tiempoJugado(long tiempoInicial, long tiempoFinal) {

    }

    @Override
    public void mostrarMenu() {

    }

    @Override
    public Pokemon crearPokemonAleatorio() {
        return null;
    }

    @Override
    public <T> T sacarAleatorio(ArrayList<T> arrayList) {
        return null;
    }

    @Override
    public String[] debilyfuerteAleatorio(String tipo) {
        return new String[0];
    }

    @Override
    public String[] nombresAleatorios(String tipo) {
        return new String[0];
    }
}

