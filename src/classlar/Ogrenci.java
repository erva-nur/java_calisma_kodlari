package classlar;

public class Ogrenci {
	
	// public-> her yerden erişilebilir, kısıtlama yok.
	// private-> sadece bulunduğu class içinden erişilebilir.
	// protected-> bulunduğu class içinden ve o classı miras alan alt classlardan erişilebilir.

	public int id;
	
	public String isim;
	
	public String soyisim;
	
	private String cinsiyet;
	
	//method overloading yapabilmek için ya parametre sayısı farklı olucak ya da parametre tipleri farklı olucak.
	
	public Ogrenci(int id,String isim,String soyisim) {
		//yapıcı metod yani constructor'dır.
		//Eğer parametreli ise Ogrenci() bu çalışır.
		System.out.println("Yapıcı metod çalıştı.");
		//this-> şu anda üzerinde çalıştığımız class demek.
		this.id=id;
		this.isim=isim;
		this.soyisim=soyisim;
	}
	public Ogrenci() {
		//Eğer parametresizse bu çalışır. 
		System.out.println("Parametresiz olan çalışıyor.");
		
	}
	public Ogrenci(int id) {
		System.out.println("Tek parametreli olan çalışır.");
	}
	public Ogrenci(String p_cinsiyet) {
		cinsiyet=p_cinsiyet;
	}
	public void cinsiyetYazdir() {
		System.out.println("Cinsiyet: "+this.cinsiyet);
	}
}
