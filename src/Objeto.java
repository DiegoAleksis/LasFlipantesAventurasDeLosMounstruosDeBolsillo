import java.util.ArrayList;

public class Objeto {
    /* costo-doble
    cantidad-entero
    nombre-String


     */

    protected double costo;
    protected int cantidad;
    protected String nombre;
    protected String tipo;

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.getClass().toString().substring(5)+
                "costo=" + costo +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public Objeto(double costo, int cantidad, String nombre, String tipo) {
        this.costo = costo;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.tipo = tipo;



        }
    }
