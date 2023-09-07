package Herencia;

public class Perro extends Mascota{
    private String raza;


    public Perro(String nombre, int edad, String color, String raza) {
        super(nombre, edad, color);
        this.raza=raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
