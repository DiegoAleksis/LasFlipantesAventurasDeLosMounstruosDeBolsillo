import java.util.ArrayList;
import java.util.Scanner;

public class Entrenador extends Personaje{
    //region-String
    //pokemonMascota-Pokemon
    //TorneosGanados-int
    //Pokedex-ArrayList<Pokemon>
    //mochila-ArrayList<Objeto>



    private String region;
private Pokemon pokemonMascota;
private int TorneosGanados;
ArrayList<Pokemon>pokedex;
ArrayList<Objeto>mochila;
private double dinero;

    public Entrenador(String nombre, int nivel, char genero, String region, Pokemon pokemonMascota, int torneosGanados, ArrayList<Pokemon> pokedex, ArrayList<Objeto> mochila, double dinero) {
        super(nombre, nivel, genero);
        this.region = region;
        this.pokemonMascota = pokemonMascota;
        TorneosGanados = torneosGanados;
        this.pokedex = pokedex;
        this.mochila = mochila;
        this.dinero = dinero;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Pokemon getPokemonMascota() {
        return pokemonMascota;
    }

    public void setPokemonMascota(Pokemon pokemonMascota) {
        this.pokemonMascota = pokemonMascota;
    }

    public int getTorneosGanados() {
        return TorneosGanados;
    }

    public void setTorneosGanados(int torneosGanados) {
        TorneosGanados = torneosGanados;
    }

    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }

    public ArrayList<Objeto> getMochila() {
        return mochila;
    }

    public void setMochila(ArrayList<Objeto> mochila) {
        this.mochila = mochila;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }


    public boolean tirarObjeto(int indice){
        try {
            mochila.remove(indice);
            return false;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Ese objeto no existe");
            return false;
        }
    }



@Override
    public boolean pelear(Pokemon PokemonVs){
        ArrayList<Pokemon>paraPelear= new ArrayList<>();

    System.out.println("Escoge 3 pokemones");
    mostrarPokedex(pokedex);
    Scanner leer=new Scanner(System.in);
    for (int i=0; i<3;i++){
        System.out.println("Ingrese el pokemon");
        try {
            int indice= leer.nextInt();
            paraPelear.add(pokedex.get(indice-1));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Ese pokemon no existe, ingresa uno ya existente");
            i--;
        }
    }
    int respuesta=0;
    do {
        System.out.println("1 Pelear");
        System.out.println("2 Usar Baya");
        System.out.println("3 Huir");
        respuesta= leer.nextInt();
            if (paraPelear.size()!=0){
                if (respuesta==1){
                    System.out.println("Escoge el pokemon para pelear");
                    mostrar.pokedex(paraPelear);
                    int eleccion= leer.nextInt();
                    if (!paraPelear.get(eleccion).pelear(pokemonMascota)) {
                        paraPelear.remove(eleccion);
                    }else {
                        return true;
                    }

                }else if (respuesta==2){
                    mostrarMochila();
                    System.out.println("Escoge la baya o la pocion");
                    int eleccion= leer.nextInt();
                    System.out.println("Escoge el pokemon para usar");
                    mostrarpokedex(paraPelear);
                    getMochila().get(eleccion-1).usar(paraPelear.get(leer.nextInt()));

                }else{
                    System.out.println("Huyendo");
                    return false;
                }
            }else{
                return false;

            }

    }while (respuesta!=0);
    return false;

}
    //pelear(abstracto)
        //escogerPokemon del pokedex
            //llamar al metodo pelear del pokemon
             //si su HP es superior a 15
                //escoger 2 fuertes y 1 debil aleatoriamente
    //sino tiene fuertes, poner 3 aleatorios
        //arreglo de pokemones de usar en la pelea
    // si es entrenador no puede huir
    //sino puedes pelear o huir- ciclo
            //darle a escoger el pokemon al entrenador
             //mostrar las estadisticas (HP, velocidad, ataque)
    // menu para pelear, curar, aumentar velocidad o ataque
         // si escoge pelear
            //llamar al metodo pelar del pokemon
         // si escoge curar
             //hay que validar si hay poscion/baya de curacion usar
    // si escoge ataque si hay poscion/baya de ataque usar
    //si escoge velocidad
            //hay que validarsi hay poscion/baya usar



    //ganar -> (metodo) el entrenador opuesto ya no tiene pokemones
            //nivel 1-> 10XP
            //nivel n(Pokemon y entrenar) ->10XP *1.5
    //perder -> (metodo) yo me quedo sin pokemones


    //tirar objeto
    //mostrar los elementos de mochila
    //usuario escoge cual tirar



    //intercambiar
        //entrenador opuesto muestra pokedex
        //escojo el pokemon que quiero
        //le proppongo uno de mi pokedex
        //y con random true o false acepta
        //si true
            //get y add (mas remove)



}
