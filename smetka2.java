package proekt_3;

import java.util.Scanner;

public class smetka2 {

	public static void main(String[] args) {
	//jabolki-50 den kg.krusi-60 den kg.grozje-100 den kg 
		double smetka = 0;
		System.out.println("Vnesi sto si pazaruval vo kilogrami");
		Scanner tastatura=new Scanner (System.in);
		System.out.println("jabolki:");
		double jabolki=tastatura.nextDouble();
		System.out.println("krusi:");
		double krusi=tastatura.nextDouble();
		System.out.println("grozje:");
		double grozje=tastatura.nextDouble();
		smetka= jabolki*50+krusi*60+grozje*100;
		System.out.println("Smetka iznesuva "+smetka+"denari");
		
		
				

	}

}
