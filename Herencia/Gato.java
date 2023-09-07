package Herencia;

public class Gato extends Mascota{
    private double peso;
    public Gato(String nombre, int edad, String color, double peso) {
        super(nombre, edad, color);
        this.peso=peso;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
}
