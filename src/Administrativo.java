public class Administrativo extends Empleado{
    private boolean presentismo;

    public Administrativo(int legajo, String nombre, float sueldoBasico, boolean presentismo) {
        super(legajo, nombre, sueldoBasico);
        this.presentismo = presentismo;
    }
    public float calcularSueldo(){

        return sueldoBasico*((presentismo)?1.13f:1);
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "presentismo=" + presentismo +
                ", legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", sueldoBasico=" + sueldoBasico +
                '}';
    }
}
