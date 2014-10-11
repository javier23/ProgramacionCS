package programacionfp.unidad2;
public class Ejercicio1 {
    public static void main(String[] args) {
        // ua (Unidad Astronómica) = 149 597 870 km
        double ua = 149597870d;
        double distanciaSolPluton = 39.44;
        double kmSolPluton = distanciaSolPluton * ua;
        System.out.println("La distancia entre el Sol y Plutón es: " + kmSolPluton + " ua");
        
        
        float ua2 = 149597870f;
        float distanciaSolPluton2 = 39.44f;
        float kmSolPluton2 = distanciaSolPluton2 * ua2;
        System.out.println("La distancia entre el Sol y Plutón es: " + kmSolPluton2 + " ua");
    }
}