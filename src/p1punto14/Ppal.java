
package p1punto14;

public class Ppal {
    static int seleccion;
    public static void main(String[] args) {
        Figura Figura1= new Figura();
        Figura1.Escoger_Figura();
        if (seleccion==0){
            Figura1.Area_Cuadrado();
        }
        else if (seleccion==1){
            Figura1.Area_Rectangulo();
        }
        else if (seleccion==2){
            Figura1.Area_Triangulo();
        }
        else if (seleccion==3){
            Figura1.Area_Circulo();
        }
        else {
            Figura1.Escoger_Figura();
        }
        Figura1.Escoger_Figura();
        //Figura1.Area_Rectangulo();
        //Figura1.Area_Triangulo();
        //Figura1.Area_Circulo();
   }
}
