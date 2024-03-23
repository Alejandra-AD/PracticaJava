public class SentenciaWhileDoWhile {
    public static void main(String[] args) {
        int i = 0;
        
        while (i<5){
            System.out.println("i = " + i);
            i++;
        }


        boolean prueba = false;

        do{
            System.out.println("se ejecuta al menos una vez");
        }while(prueba);



        prueba = true;
        i = 0;

        do{
            if(i ==10){
               prueba=false;
            }
            System.out.println("i = " + i);
            i++;
        }while(prueba);

        
    }
}
