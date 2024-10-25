//Objetivo: Contar la cantidad de veces que un elemento aparece en una lista.
//
//Instrucciones:
//
//Crea un ArrayList de palabras que contenga algunas repeticiones.
//Usa un bucle para contar cuántas veces aparece una palabra específica.
//Imprime la cantidad de veces que aparece esa palabra.

import java.util.ArrayList;

public class EjercicioNueve {
    public static void main(String[] args) {
        //Crea un ArrayList de palabras que contenga algunas repeticiones.
        ArrayList<String> palabrasR = new ArrayList<>();

        palabrasR.add("rojo");
        palabrasR.add("azul");
        palabrasR.add("verde");
        palabrasR.add("rojo");
        palabrasR.add("amarillo");
        palabrasR.add("azul");
        palabrasR.add("rojo");
        palabrasR.add("gris");

        // Palabra a contar
        String palabraBuscada = "azul";
        int contador = 0;

        //Usa un bucle para contar cuántas veces aparece una palabra específica.
        for (String palabra : palabrasR) {
            if (palabra.equals(palabraBuscada)) {
                contador++;
            }
        }

        //Imprime la cantidad de veces que aparece esa palabra.
        System.out.println("La palabra '" + palabraBuscada + "' aparece " + contador + " veces.");
    }
}
