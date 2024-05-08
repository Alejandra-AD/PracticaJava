import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);
        SimpleDateFormat fechaDF = new SimpleDateFormat("dd-MM-yyyy");
        String fechaCalendario = fechaDF.format(fecha);
        System.out.println("fechaCalendario = " + fechaCalendario);

        Calendar calendario2 = Calendar.getInstance();

        calendario2.set(1990, Calendar.JULY,25,21,30, 0);

        Date fecha2 = calendario2.getTime();
        System.out.println("fecha2 = " + fecha2);


       /* calendario.set(Calendar.MONTH,6);*/

        calendario.set(Calendar.MONTH,Calendar.JULY);
        calendario.set(Calendar.YEAR,1990);
        calendario.set(Calendar.DAY_OF_MONTH,25);
        calendario.set(Calendar.HOUR_OF_DAY,21);
        calendario.set(Calendar.MINUTE,30);
        calendario.set(Calendar.SECOND,10);
        calendario.set(Calendar.MILLISECOND,111);
        Date fecha3 = calendario.getTime();
        SimpleDateFormat fechaDF3 = new SimpleDateFormat("dd-MM-yyyy 'y' HH:mm:ss:SSS");
        String fechaFormato3 = fechaDF3.format(fecha3);
        System.out.println("fecha3 = " + fechaFormato3);




    }
}
