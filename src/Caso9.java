import java.util.Scanner;
public class Caso9 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float n1,n2,n3,asistencia,prom, Pasistencia, Mayorprom=0, Menorprom=21;
		String estado,nombre,repe="", Mayornom="", Menornom="";
		int cont=1, certi=0,nocerti=0;
		do {
		System.out.println("============");
		System.out.println("Registro "+cont);
		System.out.println("============");
		System.out.println("Nombre de alumno: ");
		nombre = sc.nextLine();
		System.out.println("Nota 1: ");
		n1 = sc.nextFloat();
		System.out.println("Nota 2: ");
		n2 = sc.nextFloat();
		System.out.println("Nota 3: ");
		n3 = sc.nextFloat();
		System.out.println("Asistencia [1-12]: ");
		asistencia = sc.nextFloat();
		
		prom=n1*0.2f+n2*0.3f+n3*0.5f;
		Pasistencia=asistencia*100/12;
		if (prom>=13 && Pasistencia>=70) {
			estado="Obtiene Certificado";
			certi=certi+1;
		}else {
			estado="Sin Certificado";
			nocerti=nocerti+1;
		}
		
		if (prom>Mayorprom) {
			Mayorprom=prom;
			Mayornom=nombre;
		}
		if (prom<Menorprom) {
			Menorprom=prom;
			Menornom=nombre;
		}
		
		sc.nextLine();
		System.out.println("===========================");
		System.out.println("=========Resultados========");
		System.out.println("===========================");
		System.out.println("Promedio: "+prom);
		System.out.println("Asistencia: "+Pasistencia+"%");
		System.out.println("Estado: "+estado);
		System.out.println("===========================");
		System.out.println("¿Registrar otro? [S/N]: ");
		cont=cont+1;
		repe = sc.nextLine();
		}while(repe.contentEquals("S")|| repe.contentEquals("s"));
		System.out.println("==========================");
		System.out.println("==========RESUEMN=========");
		System.out.println("==========================");
		System.out.println("Numero de alumno: "+(cont-1));
		System.out.println("Mayor promedio: "+Mayorprom+" pertenece a: "+Mayornom);
		System.out.println("Menor promedio: "+Menorprom+" pertenece a: "+Menornom);
		System.out.println("Numero de alumnos certificados: "+certi);
		System.out.println("Numero de alumnos sin certificado: "+nocerti);
		
	}

}