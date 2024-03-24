import java.util.Scanner;

public class CalcularNumeroMenorTarea7 {
    public static void main(String[] args) {

        Scanner snros = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que desea ingresar: ");
        int cantNumeros = snros.nextInt();

        int[] numeros = new int[cantNumeros];

        int count = numeros.length;
        int min = 100000;

        System.out.println("Ingrese "+ cantNumeros + " número(s): ");

        for(int i=0 ; i < count; i++){
            numeros[i]=snros.nextInt();
            System.out.println("-");
        }
        
        for(int num:numeros){
           /* System.out.println("num = " + num);*/
            if(min>num){
                min = num;
            }
        }
        System.out.println("min = " + min);
        String mensaje = (min<10)? "El número menor es menor que 10!":"El numero menor es igual o mayor que 10!";
        System.out.println(mensaje);
    }
}
