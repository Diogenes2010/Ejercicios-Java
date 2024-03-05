package co.com.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrabajoEnClase3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

      //Voy a utilizar list porque puedo agregar nombre por nombre y se pueden agregar más.

        List<String> estudiantes = new ArrayList<>();

        estudiantes.add("Oscar");
        estudiantes.add("Juan");
        estudiantes.add("Carlos");

        System.out.println("Los estudiantes registrados son");

        estudiantes.stream().forEach(System.out::println);
    }
}
