public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = false;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3; //98.76543
        float f = 1.2345e2f; //123.45

        datoLogico = (d < f);
        System.out.println( "datoLogico es= "+ datoLogico);

    }
}
