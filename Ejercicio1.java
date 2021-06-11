package src;
import java.util.* ;
public class Ejercicio1{
	public static void main(String[] args) {
		System.out.println("*****Ejercicio1*****");
		Ejercicio1 o = new Ejercicio1();
	}
	// variables globales de mi clase 
	int[] elementos = new int[5];
	Scanner scanner = new Scanner(System.in);

	//generando otra clase
	public Ejercicio1(){
		for(int i = 0; i<5; i++){
			pedirValor(i);
		}

		for(int i = 0; i<5; i++){
			mostrarDato(i);
		}
	}

	//generando otra clase
	public void mostrarDato(int numero){
		System.out.println("El indice es "+numero+" el valor es: " +elementos[numero]);
	}

    //generando otra clase
	public void pedirValor(int numero){
		System.out.println("Ingrese el valor No: "+numero+":");
		elementos[numero] = scanner.nextInt();
	}

}