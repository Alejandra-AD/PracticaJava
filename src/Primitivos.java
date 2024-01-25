public class Primitivos {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("numero máximo de un byte = " + Byte.MAX_VALUE);
        System.out.println("numero mínimo de  un byte = " + Byte.MIN_VALUE);
        System.out.println("**************************************************");

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bytes a " + Short.BYTES);
        System.out.println("tipo short corresponde en bytes a " + Short.SIZE);
        System.out.println("numero máximo de un short = " + Short.MAX_VALUE);
        System.out.println("numero mínimo de  un short = " + Short.MIN_VALUE);
        System.out.println("**************************************************");

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en bytes a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bytes a " + Integer.SIZE);
        System.out.println("numero máximo de un int = " + Integer.MAX_VALUE);
        System.out.println("numero mínimo de  un int = " + Integer.MIN_VALUE);
        System.out.println("**************************************************");

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en bytes a " + Long.BYTES);
        System.out.println("tipo long corresponde en bytes a " + Long.SIZE);
        System.out.println("numero máximo de un long = " + Long.MAX_VALUE);
        System.out.println("numero mínimo de  un long = " + Long.MIN_VALUE);
        System.out.println("**************************************************");

        float numeroFloat = 3.4028235e38f;//notación científica
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("tipo float corresponde en bytes a " + Float.BYTES);
        System.out.println("tipo float corresponde en bytes a " + Float.SIZE);
        System.out.println("numero máximo de un float = " + Float.MAX_VALUE);
        System.out.println("numero mínimo de  un float = " + Float.MIN_VALUE);
        System.out.println("**************************************************");

        var numeroVar = 123456789L; //se debe determinar el tipo de dato primitivo que corresponda
        System.out.println("numeroVar = " + numeroVar);

        double numeroDouble = 1.0; //por defecto si no se especifica el tipo de dato "punto flotante" se le asigna tipo double.
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("tipo double corresponde en bytes a " + Double.BYTES);
        System.out.println("tipo double corresponde en bytes a " + Double.SIZE);
        System.out.println("numero máximo de un double = " + Double.MAX_VALUE);
        System.out.println("numero mínimo de  un double = " + Double.MIN_VALUE);
        System.out.println("**************************************************");

        double realDouble = 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
    }
}
