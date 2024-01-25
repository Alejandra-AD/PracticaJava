public class HolaMundo {
    public static void main (String[] args){
        String saludar = "Hola Mundo";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
        int numero = 10;
        System.out.println("numero = " + numero);

        var numero2 = (int)((Math.random()*15)+1); //con var se indica un tipo flexible de variable dado por el tipo de dato que contenga.
        System.out.println("numero2 = " + numero2);
        
        if(numero2 > 10){
            saludar = "hola desde if ";

        }else{
            saludar ="hola desde else";
        }
        System.out.println(saludar);

    }
}

