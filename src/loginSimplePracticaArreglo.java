import java.util.Scanner;

public class loginSimplePracticaArreglo {

    public static void main(String[] args) {


        /*String[] usuarios = new String[2];
        String[] passwords = new String[2];

        usuarios [0] = "Tulio";
        passwords[0] = "12345";
        usuarios [1] = "Juanin";
        passwords[1] = "12345";*/

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

            if(usuarios[i].equals(u)&&passwords[i].equals(p)){
                isAuth = true;
                break;
            }
        }

        if (isAuth){
            System.out.println("Usuario autenticado ✔️...");
            System.out.println("Hola ".concat(u).concat("!"));
        }else{
            System.out.println("Usuario no autenticado ❌... Nombre de usuario o contraseña incorrectos");
        }


    }
}
