package programacionfp.pruebas;
public class Operadores {
    
   public static void main(String [] args){
       int x = 1;
       int y = 0;
       System.out.println("OPERADOR INCREMENTA COMO SUFIJOS");
       System.out.println("valor de x = " + x + " e y = " + y);
       
       //Operador incrementa
       y = x++;
       
       System.out.println("valor de x = " + x + " e y = " + y);
       
       // precedencia del operador incrementa
       
       y = x++ * 2;
       
       System.out.println("valor de x = " + x + " e y = " + y);
       
       
       //volvemos a valores iniciales operador incrementa sufijo
       
       System.out.println("\n\nOPERADOR INCREMENTA COMO SUFIJOS");
       System.out.println("volvemos x e y a valores iniciales");
       x= 1;
       y = 0;
       System.out.println("valor de x = " + x + " e y = " + y);
       
              //Operador incrementa
       y = ++x;
       
       System.out.println("valor de x = " + x + " e y = " + y);
       
       // precedencia del operador incrementa
       
       y = ++x * 2;
       
       System.out.println("valor de x = " + x + " e y = " + y);
       
       
   }

}