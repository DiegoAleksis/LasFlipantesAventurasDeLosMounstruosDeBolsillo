import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public  class Main implements UtilInterface{
    static ArrayList<Habilidad> habilidads=new ArrayList<>();
    static Habilidad habilidad=new Habilidad("Patada voladora", "Patada cuando vuela",40);
    static Habilidad habilidad2=new Habilidad("Rayo frio","Congelacion de cuerpo completo", 50);
    static Habilidad habilidad3=new Habilidad("Puño de fuego","Puño que quema en gran porcion a su oponente", 60);
    static ArrayList<String> tiposPokemon;







    public static void main(String[] args) throws InterruptedException {
        long tiempoInicial = System.currentTimeMillis();

        habilidads.add(habilidad);
        habilidads.add(habilidad2);
        habilidads.add(habilidad3);
        Thread.sleep(1500);
        Main objetoMain=new Main();
        objetoMain.tiempoJugado(tiempoInicial,System.currentTimeMillis());


        Poscion poscion=new Poscion(30, 2, "poscion vida", "curar");
        ArrayList<Objeto>objetos=new ArrayList<>();
        objetos.add(poscion);
        Tienda tienda=new Tienda("Mi tienda",objetos);
        tienda.comprar(30,1,8);





        int respuesta=1;
        Scanner scanner=new Scanner(System.in);
        while (respuesta!=0){
            objetoMain.mostrarMenu();
        }





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
       Random random=new Random();
       String tipo= sacarAleatorio(tiposPokemon);
       int tamNombre=nombresAleatorios(tipo).length;
       int nombre=random.nextInt(0,tamNombre);
       String nombreFinal=nombresAleatorios(tipo)[nombre];
       int hp= random.nextInt(50,200);
       boolean legendario=random.nextBoolean();
       String[] debilFuerte=debilyfuerteAleatorio(tipo);
       int fuerza=random.nextInt(50,200);
       int velocidad=random.nextInt(1,10);
       int nivel=random.nextInt(1,15);
       char genero= random.nextInt(0,10)<5? 'f':'m';

       return new Pokemon(nombreFinal,nivel,genero,tipo,sacarAleatorio(habilidads),hp,legendario,debilFuerte[0],debilFuerte[1],fuerza,velocidad );
    }

    @Override
    public <T> T sacarAleatorio(ArrayList<T> arrayList) {
        Random random=new Random();
        int indice=random.nextInt(0, arrayList.size()-1);
        return arrayList.get(indice);
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



