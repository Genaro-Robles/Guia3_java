import java.util.Scanner;
public class Caso4 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
	
		int c = 1, num_mayor=0;
		
		System.out.println("Ingrese numero: ");
		int num = sc.nextInt();
		
		while (c <= 4) {
			System.out.println("Ingrese numero "+c+": ");
			num= sc.nextInt();
			
			if (num>num_mayor)
				num_mayor = num;
			c++;
		}
		System.out.println("El numero mayor es: "+num_mayor);
	}
	}