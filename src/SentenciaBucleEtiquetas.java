public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {
        
        etiquetaBucle1:
        for (int i=0 ; i < 5 ;i++){
            System.out.println("i = " + i);
            for (int j = 0 ; j < 5 ;j++ ){
                if(i==2){
                    continue etiquetaBucle1;
                }
                System.out.println("i="+ i + " y "+ "j=" + j);
            }
        }

        etiquetaBucle2:
        for (int i = 0; i < 5 ; i++){
            System.out.println("i = " + i);
            int j = 0;
            while (j < 5){
                System.out.println("i="+ i + " y "+ "j=" + j);
                if(i == 3){
                    break etiquetaBucle2;
                }
                j++;
            }

        }

        
    }
}
