package ferroviaria.maquinaria;

import ferroviaria.personal.Maquinista;

import java.util.ArrayList;
import java.util.Scanner;

public class Trenes {
    //los atributos que componen el tren y el maquionista que es su responsable
    static Scanner sc = new Scanner(System.in);
    private static Mercancia mercancia;
    private static ArrayList<Vagones> lista;
    private Locomotoras locomotoras;
    private Vagones vagones;
    private Maquinista maquinista;
    public static int contadorT;


    public Trenes(Locomotoras locomotora, Maquinista maquinista) {
        this.locomotoras = locomotora;
        this.maquinista = maquinista;
        contadorT++;
    }

    static Vagones crearVagon(){
        int numIdent= contadorT++;
        Double cargaMaxima = 0.0;
        int cargaActual=0;
        mercancia = elegirMercancia();

        return new Vagones (numIdent, cargaMaxima, cargaActual, mercancia);
    }

    public static void añadirVagon(){
        if (getLista() < 5){
            if (lista == null){
                lista = new ArrayList<Vagones>();
            }
            lista.add(crearVagon());
        } else {
            System.out.println("No se pueden crear más.");
        }
    }

    public static Mercancia elegirMercancia() {
        do {
            System.out.println("¿Tipo de carga?");
            System.out.println("1.Perecedera\n2.No perecedera\n3.Frágil\n4.Peligrosa\n5.Dimensional");
            int opcion =sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    return Mercancia.PERECEDERA;

                case 2:
                    return Mercancia.NO_PERECEDERA;

                case 3:
                    return Mercancia.FRAGIL;

                case 4:
                    return Mercancia.PELIGROSA;

                case 5:
                    return Mercancia.DIMENSIONAL;

                default:
                    System.out.println("Selecciona una opción correcta");
            }
        } while (true);
    }

    public static void borrarVagon() {
        lista.remove(lista.get(lista.size() - 1));
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    public Locomotoras getLocomotoras() {
        return locomotoras;
    }

    public void setLocomotoras(Locomotoras locomotoras) {
        this.locomotoras = locomotoras;
    }

    public Vagones getVagones() {
        return vagones;
    }

    public void setVagones(Vagones vagones) {
        this.vagones = vagones;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public static int getLista() {
        return (lista!=null?lista.size():0);
    }

    public void setLista(ArrayList<Vagones> lista) {
        this.lista = lista;
    }

    public static int getContadorT() {
        return contadorT;
    }

    public static void setContadorT(int contadorT) {
        Trenes.contadorT = contadorT;
    }

    public Mercancia getMercancia() {
        return mercancia;
    }

    public void setMercancia(Mercancia mercancia) {
        this.mercancia = mercancia;
    }
}
