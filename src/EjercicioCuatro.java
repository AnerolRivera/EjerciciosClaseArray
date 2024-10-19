import java.util.ArrayList;
import java.util.List;

//Objetivo: Comparar dos listas y encontrar elementos comunes.
//
//Instrucciones:
//
//Crea dos ArrayList de String llamadas list1 y list2.
//Llena list1 con: "Apple", "Banana", "Cherry", "Date".
//Llena list2 con: "Banana", "Date", "Elderberry", "Fig".
//Encuentra los elementos comunes entre las dos listas y guárdalos en una nueva lista llamada commonElements.
//Imprime los elementos comunes.
public class EjercicioCuatro {

    public static void main(String[] args) {
        //Crea dos ArrayList de String llamadas list1 y list2.
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        //Llena list1 con: "Apple", "Banana", "Cherry", "Date".
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");

        //Llena list2 con: "Banana", "Date", "Elderberry", "Fig".
        list2.add("Banana");
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        //Encuentra los elementos comunes entre las dos listas y guárdalos en una nueva lista llamada commonElements.
        List<String> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2);

        //Imprime los elementos comunes.
        System.out.println("Los Elementos comunes en las listas 1 y 2 son: " + commonElements);
    }

}
