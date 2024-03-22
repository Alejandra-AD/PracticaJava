import java.util.Scanner;

public class SentenciaSwitchCaseDiaMes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Indique el número de mes:");
        int mes = s.nextInt();
        System.out.println("Indique el año:");
        int anio = s.nextInt();
        String nombreMes = null;

        switch (mes){
            case 1:
                if(mes == 1){nombreMes = "Enero";}
            case 3:
                if(mes == 3){nombreMes = "Marzo";}
            case 5:
                if(mes == 5){nombreMes = "Mayo";}
            case 7:
                if(mes == 7){nombreMes = "Julio";}
            case 8:
                if(mes == 8){nombreMes = "Agosto";}
            case 10:
                if(mes == 10){nombreMes = "Octubre";}
            case 12:
                if(mes == 12){nombreMes = "Diciembre";}
                System.out.println( nombreMes + " del "+ anio + " tiene 31 días.");
                break;
            case 4:
                if(mes == 4){nombreMes = "Abril";}
            case 6:
                if(mes == 6){nombreMes = "Junio";}
            case 9:
                if(mes == 9){nombreMes = "Septiembre";}
            case 11:
                if(mes == 11){nombreMes = "Noviembre";}
                System.out.println(nombreMes + " del "+ anio + " tiene 30 días.");
                break;
            case 2:
                if(mes == 2){nombreMes = "Febrero";}
                if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
                    System.out.println(nombreMes + " del "+ anio + " tiene 29 días.");

                }else{
                    System.out.println(nombreMes + " del "+ anio + " tiene 28 días.");
                }
                break;

        }
    }
}
