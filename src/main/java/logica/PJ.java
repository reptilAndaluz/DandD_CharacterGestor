package logica;


public class PJ {
    private String nombre;
    private int nivel;
    private Attributes atributos;

    public PJ(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.atributos = new Attributes();
    }


    public int getBonoComp() {
        return Math.floorDiv(nivel - 1, 4) + 2;
    }


    public int getMod(Attributes.Type tipo) {
        return atributos.getModifier(tipo);
    }

    // Getters y Setters
    public Attributes getAtributos() {
        return atributos;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }


}