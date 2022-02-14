package ferroviaria;

import ferroviaria.maquinaria.Locomotoras;
import ferroviaria.maquinaria.Trenes;
import ferroviaria.personal.Especialidad;
import ferroviaria.personal.JefeEstacion;
import ferroviaria.personal.Maquinista;
import ferroviaria.personal.Mecanico;

public class Main {
    public static void main(String[] args) {
        // Simulamos una estación: creamos objetos de diversos tipos:
        System.out.println("Nuestra estación la componen: ");
        System.out.println("=============================");

        // dos maquinistas
        Maquinista maquinista1 = new Maquinista("Lara", "45458787C", 2050.50, "Instructor de maquinistas");
        Maquinista maquinista2 = new Maquinista("Jesus", "60345781D", 1376.42, "Maquinista Junior");

        // imprimimos los datos de los dos maquinistas
        System.out.println(maquinista1);
        System.out.println(maquinista2+ "\n");

        // un mecánico de cada especialidad
        Mecanico mecanicoFrenos = new Mecanico("Paco", 666111666, Especialidad.FRENOS);
        Mecanico mecanicoHidraulica = new Mecanico("Luis", 616333616, Especialidad.HIDRAULICOS);
        Mecanico mecanicoElectricidad = new Mecanico("Frank", 683683683, Especialidad.ELECTRICIDAD);
        Mecanico mecanicoMotor = new Mecanico ("Carlos", 655655655, Especialidad.MOTOR);

        // imprimimos los datos de cada mecánico
        System.out.println(mecanicoFrenos);
        System.out.println(mecanicoHidraulica);
        System.out.println(mecanicoElectricidad);
        System.out.println(mecanicoMotor + "\n");

        // Un jefe de estación
        JefeEstacion jefeEstacion1 = new JefeEstacion("Rafael", "87891413G", "20-05-2018");

        // Imprimimos los datos del jefe de estación
        System.out.println(jefeEstacion1 + "\n");

        // Una locomotora
        Locomotoras locomotora1 = new Locomotoras("731731731ADC", 1000, 6, mecanicoHidraulica);

        // imprimimos los datos de la locomotora
        System.out.println(locomotora1 + "\n");

        // Creamos un tren con la locomotora que acabamos de crear
        Trenes tren1 = new Trenes(locomotora1, maquinista1);

        // Añadimos 6 vagones al tren (nos dirá que el último no se puede
        System.out.println("Añadimos 5 vagones al tren y tratamos de añadir uno más: ");
        System.out.println("***************************");
        Trenes.añadirVagon();
        Trenes.añadirVagon();
        Trenes.añadirVagon();
        Trenes.añadirVagon();
        Trenes.añadirVagon();

        System.out.println("Ahora añadimos uno mas: ");
        Trenes.añadirVagon();

        // Asignamos uno de los maquinistas al tren creado
        System.out.println("\n***** Le asignamos un maquinista *****");
        //Trenes.setMaquinista();

        // Mostramos el número de vagones del tren
        System.out.println(Trenes.contadorT);
        // Mostramos los datos del tren creado


        // Quitamos un vagón
        System.out.println("\n***** Quitamos un vagón *****");
        Trenes.borrarVagon();

        // mostramos el número de vagones del tren
        System.out.println("Vagones del tren: " + Trenes.getLista() + "\n");

        // Finalmente, contamos todos los elementos que tenemos en la estación
        System.out.println("Mi estación se compone de: ");
        System.out.println(Trenes.contadorT + " trenes");
        System.out.println(Locomotoras.contadorL + " locomotoras");
        System.out.println(JefeEstacion.contadorJ + " jefes");
        System.out.println(Maquinista.contadorM + " maquinistas");
        System.out.println(Mecanico.contadorMec + " mécanicos");

    }
}
