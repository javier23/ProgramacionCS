package programacionfp;

import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        System.out.println("escribe un un texto: ");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        System.out.println("texto introducido: " + texto);
    }
}