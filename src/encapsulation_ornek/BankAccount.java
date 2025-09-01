package encapsulation_ornek;

import java.util.Random;

public class BankAccount {
	private String account_number;
	private double balance;  //bakiye.
	boolean control=true;
	
	public BankAccount() {
        Random random = new Random();
        this.balance = random.nextDouble(1000); // 0-1000 arası bakiye
    }
	
	public String getAccount_number() {
		return account_number;
	}
	public boolean setAccount_number(String account_number) {  //hesap numarası alıcaz.
		boolean control=true;
		if(account_number.length()!=5) {
			print("Account number's length should be 5!");
			return false;
		}
		if(account_number.charAt(0)=='0') {
			 print("The account number can't start with 0!");
			 return false;
		}
		for(int i=0;i<account_number.length();i++) {
			if(!Character.isDigit(account_number.charAt(i))) {
				 print("The account number shouldn't contain letters or special characters.");
		            return false;
			}
		}
		this.account_number=account_number;
		print("You entered your account successfully!\nAccount number: " + account_number);
	    return true; // başarılı giriş
		
	}
	public double getBalance() {
		print("Your available balance: "+balance);
		return balance;
	}
	public void setBalance(double balance) {  //bakiye kontrolu yapıcaz.pozitif bakiye olmalı.
		this.balance = balance;
	}
	
	public double deposit(double deposit_) {  //para yatırma
		balance+=deposit_;
		print("Operation is successfully completed.");
		print("Your available balance : "+balance);
		return balance;
	}
	public double withdraw(double withdraw_) {  //para çekme
		balance-=withdraw_;
		if(balance<0) {
			print("The balance shouldn't be negative!");
		}
		else {
			print("The operation succesfully completed!\n Total balance: "+balance);
		}
		return balance;
	}
	public void print(String text) {
		System.out.println(text);
	}

}
