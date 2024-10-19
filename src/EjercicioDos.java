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
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            num.add(i);
        }

        //Usa un bucle for para imprimir cada número.
        System.out.println("Utilizando el bucle for:");
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }

        //Usa un bucle for-each para imprimir los mismos números.
        System.out.println("Utilizando el bucle for-each:");
        for (int numero : num) {
            System.out.println(numero);
        }

        //Usa un bucle while para imprimir los números en orden inverso.
        System.out.println("Utilizando bucle while en orden inverso:");
        int index = num.size() - 1;
        while (index >= 0) {
            System.out.println(num.get(index));
            index--;
        }
    }
}
