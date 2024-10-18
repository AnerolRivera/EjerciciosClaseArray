import java.util.ArrayList;
//Ejercicio 1: Creación y manipulación básica de ArrayList
//Objetivo: Practicar la creación de un ArrayList, agregar, eliminar y modificar elementos.
//
//Instrucciones:
//
//Crea un ArrayList de tipo String llamado fruits.
//Agrega los siguientes elementos: "Apple", "Banana", "Cherry".
//Imprime el tamaño de la lista y los elementos.
//Elimina "Banana" de la lista.
//Cambia el valor de "Cherry" por "Orange".
//Imprime la lista resultante.
public class EjercicioUno {
    public static void main(String[] args) {

        //Crea un ArrayList de tipo String llamado fruits.

        ArrayList<String> fruits = new ArrayList<>();

        //Agrega los siguientes elementos: "Apple", "Banana", "Cherry".
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        //Imprime el tamaño de la lista y los elementos.
        System.out.println("Tamaño de la lista: " + fruits.size());
        System.out.println("Elementos de la lista: " + fruits);

        //Elimina "Banana" de la lista.
        fruits.remove("Banana");

        //Cambia el valor de "Cherry" por "Orange".
        int indexOfCherry = fruits.indexOf("Cherry");
        if (indexOfCherry != -1) {
            fruits.set(indexOfCherry, "Orange");
        }

        //Imprime la lista resultante.
        System.out.println("Lista resultante: " + fruits);
    }
}
