package Polimorfismo;

public abstract class VehiculoMotor {
    private int modelo;
    private String color;
    private String marca;

    public VehiculoMotor(int modelo, String color, String marca) {
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
    }

    public abstract void arrancar();
    public abstract void avanzar();
}
