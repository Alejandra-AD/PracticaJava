import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;
        double lenguaje = 0.0;

        Scanner scannerNotas = new Scanner(System.in);

        System.out.println("Ingrese la nota de matemáticas en escala de 1,0 - 7,0:");
        matematicas = scannerNotas.nextDouble();
        System.out.println("Ingrese la nota de ciencias en escala de 1,0 - 7,0:");
        ciencias = scannerNotas.nextDouble();
        System.out.println("Ingrese la nota de historia en escala de 1,0 - 7,0:");
        historia = scannerNotas.nextDouble();
        System.out.println("Ingrese la nota de lenguaje en escala de 1,0 - 7,0:");
        lenguaje = scannerNotas.nextDouble();
        
        double promedio = (matematicas + ciencias + historia + lenguaje)/4;
        System.out.println("Promedio es = " + promedio);

        String estado = promedio > 5.49? "Aprobado":"Debe rendir examen";
        System.out.println("Estado = " + estado);


    }
}


