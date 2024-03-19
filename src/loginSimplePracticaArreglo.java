import java.util.Scanner;

public class loginSimplePracticaArreglo {

    public static void main(String[] args) {


        String[] usuarios = new String[2];
        Scanner scanner = new Scanner(System.in);

        String user1 = "Alejandra";
        String pass1 = "12345";

        String user2 = "Carolina";
        String pass2 = "12345";

        System.out.println("Ingrese usuario:");
        String u = scanner.nextLine();

        System.out.println("Ingrese contraseña");
        String p = scanner.nextLine();

        System.out.println("u = " + u);
        System.out.println("p = " + p);



    }
}
