package beans;

public class Pokemon {
    private int numero;
    private String nombre;
    private double altura;
    private double peso;
    private String habilidad;
    
    
    public Pokemon() {

    }

    public Pokemon(int numero, String nombre, double altura, double peso, String habilidad) {
        this.numero = numero;
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.habilidad = habilidad;

    }

    //SETTERS Y GETTERS

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setTelefono(String habilidad) {
        this.habilidad = habilidad;
    }
}
