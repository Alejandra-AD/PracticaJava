import javax.swing.*;

public class SentenciaForArray {
    public static void main(String[] args) {

        String[] nombres = {"Alejandra","Gigi","Elsa","Capu","Juanin","Tulio"};

        String buscar = JOptionPane.showInputDialog("Ingrese un nombres");


        int count = nombres.length;
        boolean encontrado = false;

        for(int i = 0; i < count ; i++){

          /*  if (nombres[i].equalsIgnoreCase("Alejandra") || nombres[i].equalsIgnoreCase("Tulio")){
                continue;}*/
            System.out.println(i+".- "+ nombres[i]);
            if (nombres[i].toLowerCase().contains(buscar.toLowerCase())) {
                System.out.println(nombres[i]);
                encontrado = true;
                break;
            }
        }

        if (encontrado){
            JOptionPane.showMessageDialog(null,"El nombre " + buscar + " fué encontrado");
        }else {
            JOptionPane.showMessageDialog(null,"El nombre " + buscar + " no fué encontrado");
        }

    }
}
