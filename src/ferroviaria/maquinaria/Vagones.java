package ferroviaria.maquinaria;

public class Vagones {
    private int numIdent;
    private double cargaMaxKg;
    private int carga;
    private Mercancia mercancia;

    public Vagones(int numIdent, double cargaMaxKg, int carga, Mercancia mercancia) {
        this.numIdent = numIdent;
        this.cargaMaxKg = cargaMaxKg;
        this.carga = carga;
        this.mercancia = mercancia;
    }

    @Override
    public String toString() {
        return "Vagones{" +
                "numIdent='" + numIdent + '\'' +
                ", cargaMaxKg=" + cargaMaxKg +
                "KG, carga='" + carga + '\'' +
                '}';
    }

    public int getNumIdent() {
        return numIdent;
    }

    public void setNumIdent(int numIdent) {
        this.numIdent = numIdent;
    }

    public double getCargaMaxKg() {
        return cargaMaxKg;
    }

    public void setCargaMaxKg(double cargaMaxKg) {
        this.cargaMaxKg = cargaMaxKg;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Mercancia getMercancia() {
        return mercancia;
    }

    public void setMercancia(Mercancia mercancia) {
        this.mercancia = mercancia;
    }
}
