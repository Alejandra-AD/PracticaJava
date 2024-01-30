import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//creando instancia clase scanner
        System.out.println("Ingrese un numero");
        //String numeroString = scanner.nextLine(); nextLine para obtener la linea del terminal que el usuario ingresó

        int numeroDecimal;

        try {
            numeroDecimal = scanner.nextInt();//para escanear un nro entero

        } catch (InputMismatchException e){
            System.out.println("Error, debe ingresar un número entero");
            main(args);
            return;

        }

        String resultadoBinario = "numeroBinario = " + numeroDecimal + " = "+ Integer.toBinaryString((numeroDecimal));
        
        String resultadoOctal = "numeroOctal = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHexa = "numeroHexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" +  resultadoOctal;
        mensaje += "\n" + resultadoHexa;

        System.out.println(mensaje);
    }
}
