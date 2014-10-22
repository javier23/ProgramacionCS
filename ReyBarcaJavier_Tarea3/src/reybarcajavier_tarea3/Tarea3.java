
package reybarcajavier_tarea3;

public class Tarea3 {
        public static void main(String[] args) {
        Racional r1 = new Racional(3, 4);
        Racional r2 = new Racional(1, 2);
        Racional r3 = new Racional(1, 1);
        Racional r4 = new Racional(6, 0);
        
        System.out.println("r1 vale: " + r1.toString());
        System.out.println("r2 vale: " + r2.toString());
        System.out.println("el resultado de multiplicar r1 y r2 es: " + r3.multipicar(r1, r2).toString());
        System.out.println("¿r1 es igual a r2? " + r1.igual(r2));    
        System.out.println("Si hago Racional r4 = new Racional(6,0) observo que el constructor crea " + r4);
    }
    
}
