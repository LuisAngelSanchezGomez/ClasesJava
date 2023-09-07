package Polimorfismo;

public class Auto extends VehiculoMotor{
    private int caballosDeFuerza;
    private int velocidadMax;
    private Boolean sedan;

    public Auto(int modelo, String color, String marca, int caballosDeFuerza, int velocidadMax, Boolean sedan) {
        super(modelo, color, marca);
        this.caballosDeFuerza = caballosDeFuerza;
        this.velocidadMax = velocidadMax;
        this.sedan = sedan;
    }

    @Override
    public void arrancar() {
        System.out.println("el carro arranca...");

    }

    @Override
    public void avanzar() {
        System.out.println("el carro avanza...");

    }
}
