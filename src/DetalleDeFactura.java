import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura");
        String nombreFactura;
        try {
            nombreFactura = scanner.nextLine();
        }
        catch (InputMismatchException e){

            System.out.println("Error, debe ingresar un número entero");
            main(args);
            return;

        }

        System.out.println("Ingrese dos números decimales");
        double numero1;
        double numero2;

        try{

            System.out.println("ingrese el primer número, si es decimal emplear coma (,) en vez de punto (.) ");
            numero1 = scanner.nextDouble();
            if (numero1 != 0) {
                System.out.println("ingrese el segundo número, si es decimal emplear coma (,) en vez de punto (.) ");
                numero2 = scanner.nextDouble();
                if (numero2 !=0) {
                    var sumaNumeros = numero1 + numero2;
                    var impuesto = sumaNumeros * 0.19;
                    var totalMasImpuestos = sumaNumeros + impuesto;
                    System.out.println("La factura" + nombreFactura + " tiene un valor total bruto de "+ sumaNumeros +", con un impuesto de "+ impuesto +" y el monto total después del impuesto es de "+totalMasImpuestos);
                }else{
                    System.out.println("por favor ingrese un numero distinto de cero");
                }
            }else{
                System.out.println("ingrese un numero distinto de cero");
            }

        }
        catch(InputMismatchException e){

            System.out.println("Ingrese solo números");
            main(args);
        }

    }

}
