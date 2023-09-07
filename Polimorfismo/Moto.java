package Polimorfismo;

public class Moto extends VehiculoMotor{
    private int cilindraje;
    private int capacidadTanque;
    private int velocidadMax;

    public Moto(int modelo, String color, String marca, int cilindraje, int capacidadTanque, int velocidadMax) {
        super(modelo, color, marca);
        this.cilindraje = cilindraje;
        this.capacidadTanque = capacidadTanque;
        this.velocidadMax = velocidadMax;
    }

    @Override
    public void arrancar() {
        System.out.println("La moto arranca...");

    }

    @Override
    public void avanzar() {
        System.out.println("la moto avanza...");

    }
}
