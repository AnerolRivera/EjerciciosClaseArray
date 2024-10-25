//Objetivo: Reorganizar aleatoriamente los elementos de una lista.
//
//Instrucciones:
//
//Crea un ArrayList de tipo String con los nombres de cinco ciudades.
//Utiliza Collections.shuffle() para mezclar el orden de los elementos.
//Imprime la lista antes y después de mezclarla.


import java.util.ArrayList;
import java.util.Collections;

public class EjercicioSeis {


    public static void main(String[] args) {
        //Crea un ArrayList de tipo String con los nombres de cinco ciudades.
        ArrayList<String> ciudades = new ArrayList<>();

        //Llena arraylist con las ciudades
        ciudades.add("Bogota");
        ciudades.add("Medellin");
        ciudades.add("Cali");
        ciudades.add("Cartagena");
        ciudades.add("Choco");

        //Imprime la lista antes y después de mezclarla.
        System.out.println("Listado antes de mezclar: " + ciudades);

        //Utiliza Collections.shuffle() para mezclar el orden de los elementos.
        Collections.shuffle(ciudades);

        //Imprime la lista antes y después de mezclarla.
        System.out.println("Después de mezclar: " + ciudades);


    }

}
