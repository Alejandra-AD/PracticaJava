public class SistemasNumericos {

    public static void main(String[] args) {
        
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numeroDecimal = " + numeroDecimal + " = "+ Integer.toBinaryString((numeroDecimal)));
        
        int numeroBinario = 0b111110100;//agregar 0b para transformar a binario
        System.out.println("numeroBinario = " + numeroBinario);


        System.out.println("numeroOctal = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) );
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numeroHexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
    }
}
