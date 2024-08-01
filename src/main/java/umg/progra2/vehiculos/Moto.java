package umg.progra2.vehiculos;

public class Moto extends Vehiculo {

    private boolean tieneSidecar;

    public Moto(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    boolean getTieneSidecar() {
        return tieneSidecar;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Tiene Sidecar: " + getTieneSidecar());
    }
}
