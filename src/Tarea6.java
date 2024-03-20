import javax.swing.*;

public class Tarea6 {
    public static void main(String[] args) {

        String nombre1= JOptionPane.showInputDialog("nombre 1: Ingrese su nombre y apellido");
        /*System.out.println("nombre1 = " + nombre1);*/
        String nombre2 = JOptionPane.showInputDialog("nombre 2: Ingrese su nombre y apellido");
        /*System.out.println("nombre2 = " + nombre2);*/
        String nombre3= JOptionPane.showInputDialog("nombre 3: Ingrese su nombre y apellido");
        /* System.out.println("nombre3 = " + nombre3);*/

        String nombreMax = (nombre1.split(" ")[0].length() > nombre2.split(" ")[0].length()) ? nombre1:nombre2;
        nombreMax = (nombreMax.split(" ")[0].length() > nombre3.split(" ")[0].length())? nombreMax:nombre3;
        System.out.println("La persona con el nombre mas largo es: " + nombreMax);

    }
}
