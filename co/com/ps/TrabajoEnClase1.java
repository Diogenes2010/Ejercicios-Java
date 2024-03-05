package co.com.ps;

import java.util.Scanner;


public class TrabajoEnClase1 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.println("Digite su nombre");
        String nombre = scanner.nextLine();

        System.out.println("Su nombre es " + nombre);

        System.out.println("Ingrese número 1");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese un número 2");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese un número 3");
        int num3 = scanner.nextInt();

        double promedio = (num1 + num2 + num3)/3;

        System.out.println(nombre +" el promedio de los 3 números es "+promedio);

        scanner.close();
    }

}
