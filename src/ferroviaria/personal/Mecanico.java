package ferroviaria.personal;

public class Mecanico {
    private String nombre;
    private int telefono;
    private Especialidad especialidad;
    public static int contadorMec;

    public Mecanico(String nombre, int telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
        contadorMec++;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
