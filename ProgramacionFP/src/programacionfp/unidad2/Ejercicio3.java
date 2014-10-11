package programacionfp.unidad2;


public class Ejercicio3 {
    public static void main(String[] args) {
        char caracter97 = (char)97;
        char caracter225 = (char)225;
        int caracter_e= (int)'e';
        int caracter_é= (int)'é';
        int caracterInterrogacionAbierta= (int)'¿';
        int caracterInterrogacionCerrada= (int)'?';
        int caracter_ñ= (int)'ñ';
        
        System.out.println("caracter unicode en decimal 97: " + caracter97);
        System.out.println("caracter unicode en decimal 225: " + caracter225);
        System.out.println("caracter unicode e en decimal es: " + caracter_e);
        System.out.println("caracter unicode é en decimal es: " + caracter_é);
        System.out.println("caracter unicode ¿ en decimal es: " + caracterInterrogacionAbierta);
        System.out.println("caracter unicode ? en decimal es: " + caracterInterrogacionCerrada);
        System.out.println("caracter unicode ñ en decimal es: " + caracter_ñ);
        
    }
}