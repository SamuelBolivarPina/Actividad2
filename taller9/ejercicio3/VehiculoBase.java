public class VehiculoBase {
    {
        private String serialSecreto = "ABC-123";
    }

    public class CocheHijo extends VehiculoBase {
        public void mostrarSerial() {
            // ERROR DE COMPILACIÓN: 'serialSecreto' tiene acceso privado y no es visible[cite: 20]
            // System.out.println(super.serialSecreto);
        }
    }
}
