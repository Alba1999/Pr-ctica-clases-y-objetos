package ferroviaria.maquinaria;

import ferroviaria.personal.Mecanico;

public class Locomotoras {
    private String matricula;
    private int potencia;
    private int antiguedad;
    private Mecanico mecanico;
    public static int contadorL;

    public Locomotoras(String matricula, int potencia, int antiguedad, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.antiguedad = antiguedad;
        this.mecanico = mecanico;
        contadorL++;
    }

    @Override
    public String toString() {
        return "Locomotoras{" +
                "matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", antiguedad=" + antiguedad +
                '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
