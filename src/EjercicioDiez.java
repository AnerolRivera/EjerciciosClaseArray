//Objetivo: Verificar si un elemento existe en una lista.
//
//Instrucciones:
//
//Crea un ArrayList de nombres de animales.
//Verifica si un animal específico está en la lista usando contains().
//Imprime un mensaje indicando si el animal está en la lista o no.

import java.util.ArrayList;

public class EjercicioDiez {
    public static void main(String[] args) {
        //Crea un ArrayList de nombres de animales.
        ArrayList<String> dinosaurios = new ArrayList<>();

        dinosaurios.add("Tyrannosaurus Rex");
        dinosaurios.add("Triceratops");
        dinosaurios.add("Velocirap");
        dinosaurios.add("Brachiosaurus");
        dinosaurios.add("Stegosaurus");

        // Dinosaurio a verificar
        String dinosaurioBuscado = "Velociraptor";

        //Verifica si un animal específico está en la lista usando contains().
        if (dinosaurios.contains(dinosaurioBuscado)) {
        //Imprime un mensaje indicando si el animal está en la lista o no.
            System.out.println("El dinosaurio '" + dinosaurioBuscado + "' está en la lista.");
        } else {
            System.out.println("El dinosaurio '" + dinosaurioBuscado + "' no está en la lista.");
        }
    }
}
