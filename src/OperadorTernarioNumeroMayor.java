import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        Scanner scanNumero = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = scanNumero.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = scanNumero.nextInt();

        System.out.println("Ingrese el tercer número");
        int num3 = scanNumero.nextInt();

        int numMayor = 0;
        numMayor = (num1 > num2)? num1:num2;
        numMayor = (numMayor>num3)? numMayor:num3;

        System.out.println("numMayor = " + numMayor);

    }
}
