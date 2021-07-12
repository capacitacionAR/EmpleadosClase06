public class Vendedor extends Empleado{
    private float totalVentas;

    public Vendedor(int legajo, String nombre, float sueldoBasico, float totalVentas) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }

    public float calcularSueldo(){
        return sueldoBasico + totalVentas*0.01f;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", sueldoBasico=" + sueldoBasico +
                ", totalVentas=" + totalVentas +
                '}';
    }
}
