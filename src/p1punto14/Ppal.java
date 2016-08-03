
package p1punto14;

import java.util.Scanner;

public class Ppal {
    
    public static void main(String[] args) {
        int seleccion=0;
        
        Scanner lector = new Scanner(System.in);
        do{
            System.out.println("0. Cuadrado");
            System.out.println("1. Rectángulo");
            System.out.println("2. Triángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Salir");
            System.out.println("Ingrese número de Figura geométrica: ");
            seleccion=lector.nextInt();
            if (seleccion==0){
                Cuadrado cuadro = new Cuadrado();
                cuadro.Area_Cuadrado();
            }
            else if (seleccion==1){
                //Figura1.Area_Rectangulo();
            }
            else if (seleccion==2){
                Triangulo triang = new Triangulo();
                triang.Area_Triangulo();
            }
            else if (seleccion==3){
               // Figura1.Area_Circulo();
            }
            else {
                //Figura1.Escoger_Figura();    
                
                
            }
        }while (seleccion!=4);
        
             
        
   }
}
