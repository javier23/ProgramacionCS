package programacionfp.unidad2;
public class Ejercicio1 {
    public static void main(String[] args) {
        // ua (Unidad Astronómica) = 149 597 870 km
        final double  UA = 149597870d;
        double distanciaSolPluton = 39.44;
        double kmSolPluton = distanciaSolPluton * UA;
        System.out.println("La distancia entre el Sol y Plutón es: " + kmSolPluton + " ua");
        
        
        float UA2 = 149597870f;
        float distanciaSolPluton2 = 39.44f;
        float kmSolPluton2 = distanciaSolPluton2 * UA2;
        System.out.println("La distancia entre el Sol y Plutón es: " + kmSolPluton2 + " ua");
    }
}