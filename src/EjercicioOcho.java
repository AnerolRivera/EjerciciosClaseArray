//Objetivo: Invertir el orden de los elementos en una lista.
//
//Instrucciones:
//
//Crea un ArrayList de tipo String con los días de la semana.
//Usa Collections.reverse() para invertir el orden.
//Imprime la lista original y la invertida.

import java.util.ArrayList;
import java.util.Collections;

public class EjercicioOcho {
    public static void main(String[] args) {
        //Crea un ArrayList de tipo String con los días de la semana.
        ArrayList<String> diasSemana = new ArrayList<>();

        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miércoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sábado");
        diasSemana.add("Domingo");

        //Imprime la lista original y la invertida.
        System.out.println("Listado de dias de la semana original: " + diasSemana);

        //Usa Collections.reverse() para invertir el orden.
        Collections.reverse(diasSemana);

        //Imprime la lista original y la invertida.
        System.out.println("Listado de dias de la semana invertidos: " + diasSemana);
    }

}
