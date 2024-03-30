import java.util.Scanner;

public class BuscadorPalabraTexto {
    public static void main(String[] args) {

       /* System.out.println("Ingrese la palabra que quiere buscar en el texto: ");
        Scanner scanPalabra = new Scanner(System.in);*/
        
        String texto = "tres tristes tigres tragaban trigo en un trigal";
        String palabra = "tri";
        char letra = 't';
     /*   String palabra = scanPalabra.nextLine();*/
        int maxTexto = texto.length();
        int maxPalabra = palabra.length();

        int contador = 0;

        buscar:
        for(int i = 0 ; i < maxTexto ; i++ ){
            int k = i;
            for (int j = 0 ; j < maxPalabra ; j++){
                if (texto.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }

            }
            contador ++;
        }
        if (contador == 0){
            System.out.println("La palabra " + palabra + " no se encuentra en el texto");
        }else if (contador != 1 && contador > 0){

            System.out.println("Se ha encontrado la palabra " + palabra + " " + contador + " veces");
        }else{
            System.out.println("Se ha encontrado la palabra " + palabra + " " + contador + " vez");
        }

        
    }
}
