public class Mainvehiculo {
    public static void main(String[] args){
        System.out.println("PRUEBA DE SOBRESCRITURA EN VEHÍCULOS");
        vehiculo v1 = new vehiculo();
        vehiculo v2 = new bicicleta();

        v1.mover();
        ((bicicleta) v2).moverse();
    }
}
