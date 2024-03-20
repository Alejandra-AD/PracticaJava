public class Tarea5 {
    public static void main(String[] args) {
     /*   double cantEstanque = 35.0;*/
        double cantEstanque = (Math.random() * (70 - 1) + 1);

        System.out.println("cantEstanque = " + cantEstanque);

        if (cantEstanque >= 20){
            if(cantEstanque >= 35){
                if(cantEstanque >= 40){
                    if(cantEstanque >= 60){
                        if (cantEstanque == 70){
                            System.out.println("Estanque lleno");

                        }else{
                            System.out.println("Estanque casi lleno");
                        }

                    }else{
                        System.out.println("Estanque 3/4");
                    }

                }else{
                    System.out.println("Medio Estanque");
                }

            }else{
                System.out.println("Suficiente");
            }

        }else{
            System.out.println("Insuficiente");
        }
    }
}
