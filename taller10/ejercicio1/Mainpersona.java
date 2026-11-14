public class Mainpersona {
    public static void main(String[] args) {
        System.out.println("DEMOSTRACIÓN DE POLIMORFISMO");

        // Polimorfismo: Una variable de tipo Persona puede almacenar objetos de sus clases derivadas
        persona p1 = new persona();
        persona p2 = new estudiante();
        persona p3 = new profesor();

        p1.presentarse(); // Invoca el método de Persona
        p2.presentarse(); // Invoca el método sobrescrito en Estudiante
        p3.presentarse(); // Invoca el método sobrescrito en Profesor
    }
}