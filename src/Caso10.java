import java.util.Scanner;
public class Caso10 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float horas, tph, minT, SB, boni, desc, SN,alcanzado, sueldoMa=0,sueldoMe=10000000,mayor_minT=0, cont_alcanzado=0;
		String emp,repe,Mayornom="", Menornom="", nom_minT="";
		int cont=1;
		do {
		System.out.println("*********************");
		System.out.println("Registro ("+cont+")");
		System.out.println("*********************");
		System.out.println("Empleado: ");
		emp = sc.nextLine();
		System.out.println("Horas trabajadas: ");
		horas = sc.nextFloat();
		System.out.println("Tarifa por hora: ");
		tph = sc.nextFloat();
		System.out.println("Minutos de tardanza: ");
		minT = sc.nextFloat();
		boni=0;
		desc=0;
		SB=horas*tph;
		
		if (horas<=50)boni=0;
		else if (horas<=60)boni=0.02f*SB;
		else if (horas<=70)boni=0.08f*SB;
		else if (horas<=80)boni=0.13f*SB;
		else if (horas>80) boni=0.15f*SB;
		
		if (minT<=15)desc=0;
		else if (minT<=30) desc=0.003f*SB*minT;
		else if (minT>30) desc=0.005f*SB*minT;
		SN=SB+boni-desc;
		alcanzado=horas*100/80;
		
		if (SN>sueldoMa) {
			sueldoMa=SN;
			Mayornom=emp;
		}
		if (SN<sueldoMe) {
			sueldoMe=SN;
			Menornom=emp;
		}
		if (alcanzado>90) {
			cont_alcanzado++;
		}
		if (mayor_minT<minT) {
			mayor_minT=minT;
			nom_minT=emp;
			}
		sc.nextLine();		
		System.out.println("===========================");
		System.out.println("=========Resultados========");
		System.out.println("===========================");
		System.out.println("Sueldo bruto: "+SB);
		System.out.println("Bonificacion: "+boni);
		System.out.println("Descuento: "+desc);
		System.out.println("Sueldo neto: "+SN);
		System.out.println("% Alcanzado: "+alcanzado+"%");
		System.out.println("===========================");
		System.out.println("¿Registrar otro? [S/N]: ");
		cont=cont+1;
		repe = sc.nextLine();
		}while(repe.contentEquals("S")|| repe.contentEquals("s"));
		System.out.println("==========================");
		System.out.println("==========RESUEMN=========");
		System.out.println("==========================");
		System.out.println("Numero de empleados: "+(cont-1));
		System.out.println("Sueldo neto mayor: "+sueldoMa+" pertenece a: "+Mayornom);
		System.out.println("Sueldo neto menor: "+sueldoMe+" pertenece a: "+Menornom);
		System.out.println("Empleado con la mayor cantidad de minutos de tardanza: "+nom_minT+" ("+mayor_minT+" min.)");
		System.out.println("Cantidad de empleados con mas del 90% de la meta: "+cont_alcanzado);
		
	}

}