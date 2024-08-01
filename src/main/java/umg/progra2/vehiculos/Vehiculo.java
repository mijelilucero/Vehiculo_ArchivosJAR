package umg.progra2.vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void mostrarDetalles(){
        System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + anio);
    }
}
