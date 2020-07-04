import java.util.Scanner;
public class Caso3 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
	
		int fac=1, c=1;
		
		System.out.println("Ingrese numero: ");
		int n = sc.nextInt();
		
		if(n<=7) {			
		while (c <= n) {
			fac = fac*c;
			c++;
		}
			System.out.println("El factorial de " +n+" es: "+fac);
		} else {
			System.out.println("El numero es superior de 7");
		}
		
	}
	}