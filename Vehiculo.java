package uno;

public class Vehiculo {

    public int peso;
    public int puertas;
    public String linea;
    protected String marca;

    public Vehiculo(int peso,
            int puertas,
            String linea,
            String marca) {
        this.peso = peso;
        this.puertas = puertas;
        this.linea = linea;
        this.marca = marca;

    }

    public void mostrarDatos() {
        System.out.println("Peso: " + peso);
        System.out.println("Puertas: " + puertas);
        System.out.println("Linea: " + linea);
        System.out.println("Marca: " + marca);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}