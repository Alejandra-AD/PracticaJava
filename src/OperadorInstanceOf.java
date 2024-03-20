import java.awt.geom.Arc2D;

public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Pug feliz";
        Integer num = 7;
        boolean b1 = false;

        b1 = texto instanceof String;
        System.out.println("¿texto es del tipo String? = " + b1);

        b1 = num instanceof Integer;
        System.out.println("¿num es del tipo Integer? = " + b1);
        b1 = num instanceof Number;
        System.out.println("¿num es del tipo Number? = " + b1);

        /*b1 = num instanceof Double;
        System.out.println("¿num es del tipo Double? = " + b1);*/

        b1 = texto instanceof Object;
        System.out.println("¿texto es del tipo Object? = " + b1);

        b1 = num instanceof Object;
        System.out.println("¿num es del tipo Object? = " + b1);

        Double decimal = 70.90;
        b1 = decimal instanceof Object;
        System.out.println("¿decimal es del tipo Object? = " + b1);
        b1 = decimal instanceof Double;
        System.out.println("¿decimal es del tipo Double? = " + b1);
        b1 = decimal instanceof Number;
        System.out.println("¿decimal es del tipo Number? = " + b1);

        // Con tipos genéricos (o abstractos)

        Object texto2 = "Hola";
        boolean b2 = texto2 instanceof String;
        System.out.println("texto2 es del tipo String = " + b2);
        b2 = texto2 instanceof Number;
        System.out.println("texto2 es del tipo Number = " + b2);

        Number num2 = Integer.valueOf(7);
        b2 = num2 instanceof Integer;
        System.out.println("num2 es del tipo Integer = " + b2);
        b2 = num2 instanceof Double;
        System.out.println("num2 es del tipo Double = " + b2);
        b2 = num2 instanceof Float;
        System.out.println("num2 es del tipo Float = " + b2);











    }
}
