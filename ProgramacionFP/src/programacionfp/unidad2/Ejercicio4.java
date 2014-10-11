package programacionfp.unidad2;

public class Ejercicio4 {

    public static void main(String[] args) {
        int x = 7;
        
        if(x == 7){
            System.out.println("x es 7");
        }else{
            System.out.println("x no es 7");
        }
        
        String imprime = x==7? "x es 7" : "x no es 7";
        System.out.println("operador ternario" + imprime);
        
    }
}