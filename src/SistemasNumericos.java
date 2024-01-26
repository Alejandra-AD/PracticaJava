import javax.swing.*;
import java.util.jar.JarOutputStream;

public class SistemasNumericos {

    public static void main(String[] args) {

        String numeroString = (JOptionPane.showInputDialog(null,"Ingrese un número entero"));
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroString);

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null , "Error, ingrese un número entero");
            main(args);
            return;

        }

        String resultadoBinario = "numeroBinario = " + numeroDecimal + " = "+ Integer.toBinaryString((numeroDecimal));
        
        //int numeroBinario = 0b111110100;//agregar 0b para transformar a binario
        //System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numeroOctal = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        //int numeroOctal = 0764;
        //System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexa = "numeroHexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        /*int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);*/

        String mensaje = resultadoBinario;
        mensaje += "\n" +  resultadoOctal;
        mensaje += "\n" + resultadoHexa;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
