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










    }
}
