import java.util.Scanner;
public class MiClase {
	public static void main(String[]args){
		Scanner lea= new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int num=lea.nextInt();
		if (num>10){
			System.out.println("Es numero es mayor que 10");
		}
		else{
			System.out.println("El numero es menor o igual que 10");
		}
		
	}
}
