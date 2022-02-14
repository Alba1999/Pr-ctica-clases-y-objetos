package ferroviaria.personal;

public class JefeEstacion {
    private String nombre;
    private String DNI;
    private String fechaNombramiento;
    public static int contadorJ;

    public JefeEstacion(String nombre, String DNI, String fechaNombramiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNombramiento = fechaNombramiento;
        contadorJ++;
    }

    @Override
    public String toString() {
        return "JefeEstacion{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", fechaNombramiento='" + fechaNombramiento + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(String fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }
}
