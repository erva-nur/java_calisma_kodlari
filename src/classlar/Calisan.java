package classlar;

public class Calisan {
	public String isim;
	
	public String soyisim;
	
	public int no;
	
	public String departman;
	
	public int maas;
	
	public int zam;
	
	public Calisan(String isim,String soyisim,String departman,int no,int maas) {
		this.isim=isim;
		this.soyisim=soyisim;
		this.departman=departman;
		this.no=no;
		this.maas=maas;   //burdaki yazan this bu class'ın demek yani dışardan gelen isimi burdaki isime atıyor.
		
		
	}
	public void zam_yap(int zam) {
		maas+=zam;
		System.out.println("Maasiniza "+zam+" TL kadar zam yapildi.\nGüncel maasiniz: "+maas+" TL dir.");
		
	}
	public void BilgileriGoster() {
		System.out.println("İsim: "+isim);
		System.out.println("Soyisim: "+soyisim);
		System.out.println("Departman: "+departman);
		System.out.println("No: "+no);
		System.out.println("Maas: "+maas);
		
	}
	
	
	

}
