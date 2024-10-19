import java.util.ArrayList;
import java.util.List;

public class Ejemplo {
    public static void main(String[] args) {

        String nombre="antony";
        String nombre1="fredy";
        String nombre2="juan";



        List<String> listAlumnos = new ArrayList<>();

        //Agregar elementos
        listAlumnos.add(nombre);
        listAlumnos.add(nombre1);
        listAlumnos.add(nombre2);
        listAlumnos.add(nombre1);
        listAlumnos.add(nombre2);
        listAlumnos.add(nombre1);
        listAlumnos.add(nombre2);


        System.out.println(listAlumnos);

        //Cantidad de  elementos

        System.out.println(listAlumnos.size());
        //Extraer un valor del array



        System.out.println(listAlumnos.get(1));



        //Remover

        listAlumnos.remove(2);
        System.out.println(listAlumnos);

        System.out.println("Nueva eliminacion");


        System.out.println(listAlumnos);


        System.out.println(listAlumnos.isEmpty());


        listAlumnos.clear();

        System.out.println(listAlumnos.isEmpty());


        listAlumnos.add(nombre);

        listAlumnos.add(nombre1);
        listAlumnos.add(nombre2);
        listAlumnos.add(nombre1);

        System.out.println(listAlumnos);
        listAlumnos.add(1,"carlos");

        System.out.println(listAlumnos);


        System.out.println(listAlumnos);


        listAlumnos.set(3,"marcos");

        System.out.println(listAlumnos);

        System.out.println(listAlumnos.subList(2,5));


    }
}