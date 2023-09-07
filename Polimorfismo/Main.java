package Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VehiculoMotor> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto(2023,"negro", "toyota",100,250, Boolean.TRUE));
        vehiculos.add(new Moto(2007, "negro", "ducati",220, 20, 200));

        for (VehiculoMotor vehiculo : vehiculos){
            vehiculo.arrancar();
            vehiculo.avanzar();
        }

    }
}
