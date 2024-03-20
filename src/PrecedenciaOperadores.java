public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;
        
        double calculo = (i + j + k) / 3d;
        System.out.println("calculo = " + calculo);
        
        calculo = (i + j + k) / 3d * 10; //42/3*10 = 140
        System.out.println("calculo = " + calculo);

        calculo = ++i + j-- + k / 3d * 10; // 15+8+66.666=89.66666
        System.out.println("calculo = " + calculo);

        calculo = --i + j++ + k / 3d * 10; // 13+8+66.666=87.66666
        System.out.println("calculo = " + calculo);


    }
}
