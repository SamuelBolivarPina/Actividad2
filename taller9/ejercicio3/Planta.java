public class Planta {
    public String tipo;

    public Planta(String tipo) {
        this.tipo = tipo;
    }

    public class MainIncorrecto {
        public static void main(String[] args) {
            // ERROR DE COMPILACIÓN: No se puede usar 'super' aquí porque MainIncorrecto no hereda de Planta
    //-----> super.tipo = "Orquídea"; <------
        }
    }
}
