public class Poscion extends Objeto{
    public Poscion(double costo, int cantidad, String nombre, String tipo) {
        super(costo, cantidad, nombre, tipo);
    }

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

    private double costo;
    private int cantidad;
    private String nombre;
    private String tipo;

    @Override
    public double getCosto() {
        return costo;
    }

    @Override
    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public Poscion(double costo, int cantidad, String nombre, String tipo, double costo1, int cantidad1, String nombre1, String tipo1) {
        super(costo, cantidad, nombre, tipo);
        this.costo = costo1;
        this.cantidad = cantidad1;
        this.nombre = nombre1;
        this.tipo = tipo1;
    }
}
