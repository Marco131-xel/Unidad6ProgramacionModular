package src;
import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args){
        System.out.println("*****Ejercicio4*****");
        Ejercicio4 t = new Ejercicio4();
    }   

    int[] elementos = new int[10];
    int distancia=0;
    int random;

    public Ejercicio4(){

      generarNumero();

    }

    public void generarNumero(){
      for(int i = 0;i < elementos.length ; i++){
        random = (int)(Math.random()*15+1);
        elementos[i] = random;
        System.out.println("El indice es "+ (i+1) + " el valor es: "+ elementos[i]);
      }
      distanciaDato(random);

    }

    public void distanciaDato(int random){
      for(int i =0; i<elementos.length; i++){
        distancia = 15 - elementos[i];
        System.out.println("La distancia entre "+ 15 + " - "+ elementos[i] +" es : "+distancia);

      }
    }

}      