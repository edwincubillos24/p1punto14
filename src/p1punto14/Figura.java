
package p1punto14;

import java.util.Scanner;


public class Figura extends Cuadrado{
    private double radio,altura,base;
    private Scanner lector;
    public int seleccion;
    public void Escoger_Figura(){
        System.out.println("0. Cuadrado");
        System.out.println("1. Rectángulo");
        System.out.println("2. Triángulo");
        System.out.println("3. Círculo");
        System.out.println("Ingrese número de Figura geométrica: ");
        seleccion=lector.nextInt();
        
    }
            
   /* public void Area_Cuadrado(){
        lector = new Scanner(System.in);
        System.out.print("Digite lado del cuadrado: ");
        lado= lector.nextDouble();
        area = lado*lado;
        System.out.print("El area del cuadrado es: "+area);
    }*/
    
    public void Area_Rectangulo(){
        lector = new Scanner(System.in);
        System.out.print("Digite base del rectángulo: ");
        base = lector.nextDouble();
        System.out.print("Digite altura del rectángulo: ");
        altura = lector.nextDouble();
        System.out.println("El area del rectángulo es: "+base*altura);
    }
    public void Area_Triangulo(){
        lector = new Scanner(System.in);
        System.out.print("Digite base del triángulo: ");
        base = lector.nextDouble();
        System.out.print("Digite altura del triángulo: ");
        altura = lector.nextDouble();
        System.out.println("El area es del triángulo es: "+base*altura/2);
    }
    public void Area_Circulo(){
        lector = new Scanner(System.in);
        System.out.print("Digite radio del círculo: ");
        area = lector.nextDouble();
        System.out.println("El area del círculo es: "+area*area);
    }

}
