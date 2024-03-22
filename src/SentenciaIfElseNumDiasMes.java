import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {

        //función años bisiesto


     /*
        int year = 2024;
      if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println(year + " es bisiesto");
            } else if (year % 100 == 0 && year % 400 == 0) {
                System.out.println(year + " es bisiesto");
            }else{
                System.out.println("no es bisiesto");
            }
        }else {
            System.out.println("no es bisiesto");
        }*/

        Scanner s = new Scanner(System.in);

        System.out.println("Indique el año");
        int anio = s.nextInt();

        if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
            System.out.println( "El año " + anio + " es bisiesto");
        }else{
            System.out.println( "El año  " + anio + " no es bisiesto");
        }

    }
}
