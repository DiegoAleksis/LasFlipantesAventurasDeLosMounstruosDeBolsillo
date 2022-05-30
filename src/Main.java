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










      // long tiempoInicial=System.currentTimeMillis();
       //Thread.sleep(20000);
       //long fin=System.currentTimeMillis();
       //double tiempoPresente=(double) ((fin-tiempoInicial)/1000);
        //System.out.println(tiempoPresente +" segundos");


    }

    @Override
    public void tiempoJugado(long tiempoInicial, long tiempoFinal) {
        double tiempoPresente=(double) ((tiempoFinal-tiempoInicial)/1000);
        System.out.println(tiempoPresente +" segundos");
    }

    @Override
    public void mostrarMenu() {
        System.out.println("EXPLORAR");
        System.out.println("Entar a tienda");
        System.out.println("Tirar objeto");
        System.out.println("Ver estadisticas");
        System.out.println("Tiempo jugado");

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

        String[]Caja=new String[2];
        switch (tipo){
            case "agua":
                Caja[0]="electrico";
                Caja[1]="fuego";
                break;
            case "fuego":
                Caja[0]="agua";
                Caja[1]="electrico";
                break;
            default:
                Caja[0]="fuego";
                Caja[1]="agua";
                break;

        }





        return Caja;
    }

    @Override
    public String[] nombresAleatorios(String tipo) {
        String agua[]= {"squirtle","psyduck","poolwag"};
        String fuego[]={"charizard","charmander","cyndaquil"};
        String electrico[]={"pikachu", "raychu", "aska"};
        if (tipo.equals("agua")){
            return agua;
        }else if(tipo.equals("fuego")){
            return fuego;
        }else{
            return electrico;
        }
    }



}



