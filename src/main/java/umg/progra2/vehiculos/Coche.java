package umg.progra2.vehiculos;

public class Coche extends Vehiculo {

    private int numeroDePuertas;

    public Coche(String marca, String modelo, int anio, int numeroDePuertas) {
        super(marca, modelo, anio);
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + numeroDePuertas);
    }
}
