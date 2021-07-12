import java.util.ArrayList;

public class ListaEmpleados {
    private ArrayList<Empleado> lista;

    public ListaEmpleados(){
        this.lista = new ArrayList<>();
    }
    public void agregar(Empleado nuevo){
        lista.add(nuevo);
    }

    public float sueldoBajo(){
        float sueldoBa = 0;
        for(Empleado e: lista){
            if(sueldoBa == 0 ||e.calcularSueldo()<sueldoBa){
                sueldoBa = e.calcularSueldo();
            }
        }
        return sueldoBa;
    }
}
