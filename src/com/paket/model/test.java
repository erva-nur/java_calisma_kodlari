package com.paket.model;

public class test {

	public static void main(String[] args) {
		Calisan calisan=new Calisan();
		
		calisan.setId(15L);
		System.out.println("Çalışan id si :"+calisan.getId());
		
		calisan.setMaas(7500);
		System.out.println("Maaş: "+calisan.getMaas());

	}

}
