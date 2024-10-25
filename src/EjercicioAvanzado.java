//Objetivo: Practicar la manipulación de listas de objetos y su ordenación.
//
//Instrucciones:
//
//Crea una clase Person con dos atributos: name (String) y age (int).
//Crea una lista de personas (ArrayList<Person>) y añade algunas instancias de Person.
//Ordena la lista de personas por edad usando un Comparator.
//Imprime la lista de personas ordenada.
//Este ejercicio implica que entiendas cómo implementar comparaciones entre objetos, algo crucial en Java para trabajar con colecciones.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Crea una clase Person con dos atributos: name (String) y age (int).
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " años)";
    }
}
public class EjercicioAvanzado {
    public static void main(String[] args) {
        //Crea una lista de personas (ArrayList<Person>) y añade algunas instancias de Person.
        ArrayList<Person> personas = new ArrayList<>();
        personas.add(new Person("Aáron", 15));
        personas.add(new Person("Emily", 6));
        personas.add(new Person("Samuel", 23));
        personas.add(new Person("Alejandro", 29));

        //Ordena la lista de personas por edad usando un Comparator.
        Collections.sort(personas, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });

        //Imprime la lista de personas ordenada.
        System.out.println(" La lista de personas ordenada por edad es:");
        for (Person persona : personas) {
            System.out.println(persona);
        }
    }


}
