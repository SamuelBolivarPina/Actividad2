public class Pez extends Animal {
    public String tipoAgua;

    public Pez(String especie, String tipoAgua) {
        super(especie);
        this.tipoAgua = tipoAgua;
    }

    public void mostrarEspecie() {
        super.mostrarEspecie(); // Llama al método mostrarEspecie de Animal
        System.out.println("Tipo de agua: " + tipoAgua); // Agrega el atributo propio
    }
}
