package classlar;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Calisanin adini giriniz: ");
		String isim=scanner.nextLine();
		
		System.out.print("Calisanin soyadini giriniz: ");
		String soyisim=scanner.nextLine();
		
		System.out.print("Departman: ");
		String departman=scanner.nextLine();
		
		scanner.nextLine();
		
		System.out.print("No: ");
		int no=scanner.nextInt();
		
		System.out.print("Maas: ");
		int maas=scanner.nextInt();
		
		
		
		Calisan calisan=new Calisan(isim,soyisim,departman,no,maas);
		
		String islemler="1-Çalısan Bilgisini Göster\n2-Zam Yap";
		System.out.println("-----------------------------------------------");
		System.out.println(islemler);
		System.out.print("Yapmak istediginiz islemi seciniz: ");
		int girilen=scanner.nextInt();
		if (girilen==1) {
			calisan.BilgileriGoster();
		}
		else if (girilen==2) {
			System.out.print("Zam miktarini yaziniz: ");
			int zam=scanner.nextInt();
			calisan.zam_yap(zam);
		}
		else {
			System.out.println("Lütfen geçerli bir sayi giriniz!!!");
		}

	}

}
