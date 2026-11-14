public class Empleado extends Persona {
    public String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método mostrarDetalles de Persona
        System.out.println("Departamento: " + departamento);
    }
}
