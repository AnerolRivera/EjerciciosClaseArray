import java.util.ArrayList;
import java.util.List;
 // Objetivo: Convertir un ArrayList en un array nativo de Java.
 //
 //Instrucciones:
 //
 //Crea un ArrayList de enteros con los valores del 1 al 5.
 //Convierte este ArrayList en un array de tipo Integer[].
 //Imprime el contenido del array usando un bucle for.
public class EjercicioCinco {
    public static void main(String[] args) {
        //Crea un ArrayList de enteros con los valores del 1 al 5.
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }

        //Convierte este ArrayList en un array de tipo Integer[].
        Integer[] array = new Integer[numeros.size()];
        array = numeros.toArray(array);

        //Imprime el contenido del array usando un bucle for.
        System.out.println("El Contenido del array es:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
