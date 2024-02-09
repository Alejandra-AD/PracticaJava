import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        //capturar nombre
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tres nombres: ");
        String nombreA = scanner.nextLine();
        String nombreB = scanner.nextLine();
        String nombreC = scanner.nextLine();

        //string nombre pasarlo a array con toCharArray()

        char [] nombreAArray = nombreA.toCharArray();
        //System.out.println("nombreAArray = " + Arrays.toString(nombreAArray));
        char [] nombreBArray = nombreB.toCharArray();
        char[] nombreCArray = nombreC.toCharArray();

    
        // formateando nombres

        String nombreAFormateado = ((Character.toString(nombreAArray[1])).toUpperCase()) + "." + nombreA.substring(nombreA.length()-2);
        //System.out.println("nombreAFormateado = " + nombreAFormateado);
        String nombreBFormateado = ((Character.toString(nombreBArray[1])).toUpperCase()) + "." + nombreB.substring(nombreB.length()-2);
        //System.out.println("nombreBFormateado = " + nombreBFormateado);
        String nombreCFormateado = ((Character.toString(nombreCArray[1])).toUpperCase()) + "." + nombreC.substring(nombreC.length()-2);
        //System.out.println("nombreCFormateado = " + nombreCFormateado);

        // imprimiendo nombres en una variable nueva en formato N.es_A.ia_E.pe
        String variableNombres = nombreAFormateado.concat("_").concat(nombreBFormateado).concat("_").concat(nombreCFormateado);
        System.out.println("variableNombres = " + variableNombres);


        /* Versión profe:

        public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);

    }
}
         */


    }
}
