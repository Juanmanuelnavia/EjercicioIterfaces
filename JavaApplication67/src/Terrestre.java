
    
public class Terrestre extends Vehiculo implements Motor {
    private int cantidadLlantas;
    private String usoVehiculo; 

    public Terrestre(int velocidadActual, int velocidadMaxima, int cantidadLlantas, String usoVehiculo) {
        super(velocidadActual, velocidadMaxima);
        this.cantidadLlantas = cantidadLlantas;
        this.usoVehiculo = usoVehiculo;
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }
}
