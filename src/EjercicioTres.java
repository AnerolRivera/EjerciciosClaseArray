import java.util.ArrayList;
import java.util.List;

//Objetivo: Filtrar elementos en una lista según un criterio específico.
//
//Instrucciones:
//
//Crea un ArrayList de números enteros.
//Llénalo con los números 1 a 10.
//Filtra los números pares en una nueva lista llamada evenNumbers.
//Imprime la lista original y la lista de números pares.
public class EjercicioTres {
    public static void main(String[] args) {
        //Crea un ArrayList de números enteros.
        //Llénalo con los números 1 a 10.
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            num.add(i);
        }

        //Filtra los números pares en una nueva lista llamada evenNumbers.
        List<Integer> evenNumbers = new ArrayList<>();
        for (int numero : num) {
            if (numero % 2 == 0) {
                evenNumbers.add(numero);
            }
        }

        //Imprime la lista original y la lista de números pares.
        System.out.println("La Lista inicial es: " + num);
        System.out.println("Los Números pares son: " + evenNumbers);
    }
}
