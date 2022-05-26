import java.util.ArrayList;

public interface UtilInterface {

    void tiempoJugado(long tiempoInicial, long tiempoFinal);

    void mostrarMenu();

    Pokemon crearPokemonAleatorio();


    <T> T sacarAleatorio(ArrayList<T>arrayList);

    String[] debilyfuerteAleatorio(String tipo);


    String[] nombresAleatorios(String tipo);


}
