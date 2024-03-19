import java.util.Scanner;

public class LoginSimplePracticaOperadorTernario {
    public static void main(String[] args) {

        String[] usuarios = {"Tulio", "Juanin", "Alejandra"};
        String[] passwords = {"123", "1234", "12345"};

        boolean isAuth = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese usuario:");
        String u = scanner.nextLine();

        System.out.println("Ingrese contraseña");
        String p = scanner.nextLine();

        System.out.println("u = " + u);
        System.out.println("p = " + p);


        for( int i = 0; i<usuarios.length ; i++ ){
            isAuth = (usuarios[i].equals(u)&&passwords[i].equals(p))? true:isAuth;
        }

        String mensaje = isAuth? "Usuario autenticado ✔️...\nHola ".concat(u).concat("!") : "Usuario no autenticado ❌... \nNombre de usuario o contraseña incorrectos";
        System.out.println(mensaje);

    }
}
