package uno;

public class Coche extends Vehiculo {
    private String modelo;

    public Coche(int peso, int puertas, String linea, String marca, String modelo) {
        super(peso, puertas, linea, marca); // Llamada al constructor de Vehiculo
        this.modelo = modelo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("peso: " + peso);
        System.out.println("Puertas: " + puertas);
        System.out.println("linea: " + linea);
        System.out.println("Marca: " + marca); // Acceso al atributo protegido de Vehiculo
        System.out.println("Modelo: " + modelo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}