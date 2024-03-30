import java.util.Scanner;

public class BuscadorPalabraTexto {
    public static void main(String[] args) {

       /* System.out.println("Ingrese la palabra que quiere buscar en el texto: ");
        Scanner scanPalabra = new Scanner(System.in);*/
        
        String texto = "tres tristes tigres tragaban trigo en un trigal";
        String palabra = "trigo";
        char letra = 't';
     /*   String palabra = scanPalabra.nextLine();*/
        int maxTexto = texto.length();
        int maxPalabra = palabra.length();

        int contador = 0;


        for(int i = 0 ; i < maxTexto ; i++ ){
            for (int j = 0 ; j < maxPalabra;j++){
                if (texto.charAt(i) != letra){
                    continue;
                }
                contador ++;
            }
        }

        System.out.println(contador);
        
    }
}
