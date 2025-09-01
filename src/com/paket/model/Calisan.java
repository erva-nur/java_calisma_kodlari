package com.paket.model;

public class Calisan {
	private Long id;
	private String isim;
	private String soyisim;
	private int maas;
	
	public Calisan() {
		//parametresiz boş bir constructor tanımladık.
	}
	
	public Calisan(Long id,String isim,String soyisim,int maas) {
		this.id=id;
		this.isim=isim;
		this.soyisim=soyisim;
		this.maas=maas;
	}
//alt+shift+s deyip generate getter and setter tıklayıp hangi variable için istiyosan onu seçersin.
//set metodu ile erişip değer atadık.
//get metodu ile değere ulaştık.
//koşullu bişeyler falan yazcaksak set içine yazarız.
	public Long getId() {   //okumak için
		return id;
	}

	public void setId(Long id) {   //değiştirmek için falan
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		if(maas>=1000 && maas<=5000) {
			this.maas=maas;
		}
		//else yazmana gerek yok zaten bişey return edemez void bu.
	}

} 
