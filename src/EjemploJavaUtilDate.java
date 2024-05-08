import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);
        SimpleDateFormat dateFormatEjemplo = new SimpleDateFormat("dd-MM-yyyy");
        String fechaConDateFormat = dateFormatEjemplo.format(fecha);
        System.out.println("fechaConDateFormat = " + fechaConDateFormat);

    }
    
}
