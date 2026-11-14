public class Empleado extends Persona {
    public String departamento;
    public Empleado(String nombre, int edad, String departamento){
        super(nombre,edad);
        this.departamento = departamento;
    }
}
