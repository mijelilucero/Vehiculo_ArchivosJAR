package umg.progra2;

import lab1.Conductor.Conductor;
import lab1.Conductor.ConductorDeCoche;
import lab1.Conductor.ConductorDeMoto;
import umg.progra2.vehiculos.Moto;
import umg.progra2.vehiculos.Vehiculo;
import umg.progra2.vehiculos.Coche;

public class Main {
    public static void main(String[] args) {

        Conductor conductorCoche = new ConductorDeCoche("Andrea Martínez", "XYZ456", 10);
        Conductor conductorMoto = new ConductorDeMoto("Carlos Pérez", "MNO123", false);

        conductorCoche.mostrarInformacion();
        System.out.println();
        conductorMoto.mostrarInformacion();
    }
}