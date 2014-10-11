package programacionfp.unidad2;
public class Ejercicio2 {
     public static void main(String[] args) {

       final int VELOCIDAD_LUZ=300000;
       final long SEGUNDOS_UN_AÑO=365*24*60*60;

       long añoLuz=SEGUNDOS_UN_AÑO*VELOCIDAD_LUZ;
       System.out.println("UN AÑO LUZ TIENE  " +añoLuz+"km.");

   }
}