import java.util.Scanner;
import java.util.zip.InflaterInputStream;

import javax.print.DocFlavor.INPUT_STREAM;

public class HesapMakinesi {

	public static void main(String[] args) {
		int a, b,c,select;
		double d;
		Scanner inp = new Scanner(System.in);
		System.out.println("�lk Say�y� Giriniz");
		a=inp.nextInt();
		System.out.println("�kinci Say�y� Giriniz");
		b=inp.nextInt();
		System.out.println("1-Toplama 2-��karma 3-�arpma 4-B�lme");
		System.err.println("Se�iminiz: ");
		select= inp.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("Toplam: " + (a+b));
			break;
		case 2:
			System.out.println("Toplam: " + (a-b));
			break;
		case 3:
			System.out.println("Toplam: " + (a*b));
			break;
		case 4:
			System.out.println("Toplam: " + (a/b));
			break;
		}
	}

}
