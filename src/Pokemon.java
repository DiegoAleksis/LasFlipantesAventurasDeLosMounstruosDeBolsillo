public class Pokemon extends Personaje{

    //tipo-String
    //habilidad-Habilidag
    //hp-int
    //esLegendario-boolean
    //debilVS- String
    //fuerteVs-String
private String Tipo;
private Habilidad habilidad;
private int hap;
private boolean esLegendario;
private String debilVs;
private String fuerteVs;

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public int getHap() {
        return hap;
    }

    public void setHap(int hap) {
        this.hap = hap;
    }

    public boolean isEsLegendario() {
        return esLegendario;
    }

    public void setEsLegendario(boolean esLegendario) {
        this.esLegendario = esLegendario;
    }

    public String getDebilVs() {
        return debilVs;
    }

    public void setDebilVs(String debilVs) {
        this.debilVs = debilVs;
    }

    public String getFuerteVs() {
        return fuerteVs;
    }

    public void setFuerteVs(String fuerteVs) {
        this.fuerteVs = fuerteVs;
    }

    public Pokemon(String nombre, int nivel, char genero, String tipo, Habilidad habilidad, int hap, boolean esLegendario, String debilVs, String fuerteVs) {
        super(nombre, nivel, genero);
        Tipo = tipo;
        this.habilidad = habilidad;
        this.hap = hap;
        this.esLegendario = esLegendario;
        this.debilVs = debilVs;
        this.fuerteVs = fuerteVs;
    }


    //pelea
        //consumir pocion o baya para ataque?
        //ataque base de habilidad +20
        //si mi pokemon es fuerteVs el pokemon opuesto
            //+ataque de habilidad
        //sino si mi pokemon es debilVs el pokemon opuesto
            //-ataque de habilidad
        //sino
            //normal ataque
        //cuando se lanza el ataque se resta la cantidad
        //del ataque del Hp

}
