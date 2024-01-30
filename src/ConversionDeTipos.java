public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "10000.00";

        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "TruE";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 10;
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        String otroNumeroStr2 = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr2 = " + otroNumeroStr2);

        int i = 10000;

        short s = (short) i;//casting forzamos a la conversión
        System.out.println("s = " + s);
        System.out.println("máximo valor del short es = " + Short.MAX_VALUE);

        long l = i;
        System.out.println("l = " + l);

        char b = (char) i ;
        System.out.println("b = " + b);

        float f = i;
        System.out.println("f = " + f);



    }
}