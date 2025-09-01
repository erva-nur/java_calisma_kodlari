package classlar;

public class test1 {
	public static void main(String[] args) {
	Ogrenci ogrenci1=new Ogrenci(7, "Eda", "Alp");  // bu yapıcı metod yani constructor dır. Bu isim diğer dosyanın adıyla aynı olmalı dikkat et.
	Ogrenci ogrenci2=new Ogrenci();
	//ogrenci1.id=5;
	//ogrenci1.isim="Erva Nur";
	//ogrenci1.soyisim="Temel";
	Ogrenci ogrenci3=new Ogrenci("Kız");
	
	System.out.println("ID: " + ogrenci1.id);
    System.out.println("İsim: " + ogrenci1.isim);
    System.out.println("Soyisim: " + ogrenci1.soyisim);
    ogrenci3.cinsiyetYazdir();

    }
}