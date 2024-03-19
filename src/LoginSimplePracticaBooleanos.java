import java.util.Scanner;

public class LoginSimplePracticaBooleanos {
    public static void main(String[] args) {

        String user = "Alejandra", pass = "martini123";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        
        String usuario = scanner.nextLine();
        System.out.println("usuario = " + usuario);

        System.out.println("Ingrese contraseña: ");
        String contrasena = scanner.nextLine();
        System.out.println("contraseña = " + contrasena);

        if ((user.equals(usuario)) && (pass.equals(contrasena))){
            System.out.println("Hola! " + usuario);
        } else{
            System.out.println("usuario o contraseña incorrectos");
        }

        
    }
}
