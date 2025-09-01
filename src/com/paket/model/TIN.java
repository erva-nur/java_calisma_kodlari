package com.paket.model;

import java.util.Random;

public class TIN {
	private String full_name;
	
	private String id;
	
	boolean control;

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		
		if(id.length()==11) {
			
			for(int i=0;i<id.length();i++) {
				char char_=id.charAt(i);
				if(Character.isDigit(char_)) {   //sayi olup olmadığını kontrol eder.
					control=true;
				}
				else {
					control=false;
					break;
				}
			}
			if(control) {
				Random random=new Random();
				this.id=id;
				int number=random.nextInt(100);  // 100 e kadar rastgele bir sayı ver demek.
				printResult("Counter no: "+number);
			}
			else {
				printResult("Please enter the whole character as number!!!");
			}
			

		}
		else {
			printResult("Turkish ID number's length should be 11.");
		}
		
		
			}
	
	public void printResult(String result) {
		System.out.println(result);
	}

//charAt(i) → i’inci karakteri alır ve char tipinde döndürür.
//Character.isDigit(char_) ile bu karakterin sayı mı yoksa harf/simge mi olduğunu kontrol ediyoruz.
	
}
	
	


