public class Baya extends Objeto {
       /* efecto- String
    duracion - entero
            usar
                si es curacion
                    aumentar 20 hp
                si es fuerza
                    aumentar 20 de ataque
                    si es velocidad
                        aumentar 20 velocidad
                        */

    private String efecto;
    private int duaracion;

    public Baya(double costo, int cantidad, String nombre, String tipo) {
        super(costo, cantidad, nombre, tipo);
    }

    public Baya(double costo, int cantidad, String nombre, String tipo, String efecto, int duaracion) {
        super(costo, cantidad, nombre, tipo);
        this.efecto = efecto;
        this.duaracion = duaracion;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public int getDuaracion() {
        return duaracion;
    }

    public void setDuaracion(int duaracion) {
        this.duaracion = duaracion;
    }
}
