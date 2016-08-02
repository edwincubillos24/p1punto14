
package p1punto14;

import java.util.Scanner;


public class Cuadrado {
    double lado,area;
    Scanner lector;
    public void Area_Cuadrado(){
        lector = new Scanner(System.in);
        System.out.print("Digite lado del cuadrado: ");
        lado= lector.nextDouble();
        area = lado*lado;
        System.out.println("El area del cuadrado es: "+area);
    }
    
}
