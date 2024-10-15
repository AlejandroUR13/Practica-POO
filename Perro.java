package uno;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza, int edad) {
        super(nombre, edad);
        this.raza = raza;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Raza: " + raza);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

}
