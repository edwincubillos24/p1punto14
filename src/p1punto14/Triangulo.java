/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1punto14;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class Triangulo {
    double base, altura,area;
    Scanner lector;
    public void Area_Triangulo(){
        lector = new Scanner(System.in);
        System.out.print("Digite lado del base: ");
        base= lector.nextDouble();
        System.out.print("Digite lado del altura: ");
        altura= lector.nextDouble();
        area = base*altura/2;
        System.out.println("El area del cuadrado es: "+area);
        
    }
}
