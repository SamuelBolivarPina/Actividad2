public class CocheError extends vehiculoerror{
    // ERROR DE COMPILACIÓN: El compilador detecta que no estás sobrescribiendo ningún método real,
    // porque la clase padre espera un 'int' y aquí no le pasas nada.
    @Override
    public void acelerar() {
        System.out.println("El coche acelera.");
    }
}
