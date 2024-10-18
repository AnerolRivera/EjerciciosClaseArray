import java.util.ArrayList;
import java.util.List;

//Objetivo: Practicar la iteración sobre listas.
//
//Instrucciones:
//
//Crea un ArrayList de números enteros llamado numbers y añade los números del 1 al 5.
//Usa un bucle for para imprimir cada número.
//Usa un bucle for-each para imprimir los mismos números.
//Usa un bucle while para imprimir los números en orden inverso.
public class EjercicioDos {

    public static void main(String[] args) {

        //Crea un ArrayList de números enteros llamado numbers y añade los números del 1 al 5.
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        //Usa un bucle for para imprimir cada número.
        System.out.println("Usando bucle for:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //Usa un bucle for-each para imprimir los mismos números.
        System.out.println("Usando bucle for-each:");
        for (int number : numbers) {
            System.out.println(number);
        }

        //Usa un bucle while para imprimir los números en orden inverso.
        System.out.println("Usando bucle while en orden inverso:");
        int index = numbers.size() - 1; // Comenzar desde el último índice
        while (index >= 0) {
            System.out.println(numbers.get(index));
            index--;
        }
    }
}
