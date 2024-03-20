import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {
        /*El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
                Podría ser utilizando operador ternario.*/

        Scanner sNumeros = new Scanner(System.in);

        System.out.println("Programa para ordenar números de mayor a menor. Ingrese solo un números enteros ej: 7,9,15,2");

        System.out.println("Ingrese el primer número: ");
        int num1 = sNumeros.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = sNumeros.nextInt();

        int numMayor = (num1 > num2)? num1:num2;
        int numMenor = !(num1 > num2)? num1:num2;

        System.out.println("Sus número ordenados de mayor a menor son: " + numMayor + ", " + numMenor);

    }
}
