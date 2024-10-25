//Objetivo: Eliminar duplicados de una lista usando un Set.
//
//Instrucciones:
//
//Crea un ArrayList de números enteros que contenga duplicados.
//Convierte la lista a un Set para eliminar los duplicados.
//Imprime la lista original y el conjunto resultante.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjercicioSiete {

    public static void main(String[] args) {
        //Crea un ArrayList de números enteros que contenga duplicados.
        List<Integer> numerosE = new ArrayList<>();

        numerosE.add(1);
        numerosE.add(2);
        numerosE.add(3);
        numerosE.add(2);
        numerosE.add(4);
        numerosE.add(1);
        numerosE.add(5);

        //Imprime la lista original y el conjunto resultante.
        System.out.println("Listado de numeros original: " + numerosE);

       //Convierte la lista a un Set para eliminar los duplicados.
        Set<Integer> numerosSinDuplicados = new HashSet<>(numerosE);

        //Imprime la lista original y el conjunto resultante.
        System.out.println("Conjunto de numeros sin duplicados: " + numerosSinDuplicados);
    }
}
