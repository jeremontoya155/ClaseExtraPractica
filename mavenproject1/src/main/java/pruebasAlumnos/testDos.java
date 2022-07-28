package pruebasAlumnos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class testDos {
    public static void main(String[] args) {
        int num = cargarNumero("Ingrese un número: ");
        List<String> divisible = new ArrayList<>();
        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                divisible.add("FizzBuzz");
            } else if (i % 3 == 0) {
                divisible.add("Fizz");
            } else if (i % 5 == 0) {
                divisible.add("Buzz");
            } else {
                divisible.add(String.valueOf(i));
            }

        }
        divisible.forEach(System.out::println);
    }
    
    public static int cargarNumero(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.println(texto);
        int num = leer.nextInt();
        return num;
    }
}
