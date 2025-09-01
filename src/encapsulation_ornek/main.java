package encapsulation_ornek;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	/*Soru:
Bir BankAccount sınıfı oluştur.

Private alanlar: accountNumber (String), balance (double)

Getter ve setter metodlarıyla:

Hesap numarasını alabil. 5 haneli olsun ve sıfırla başlamasın,içinde harf olmasın.hesap numarası girince random bakiye atansın 0 ile 1000 arası ona göre işlem yap.

Bakiye kontrolü yapabil

Sadece pozitif bakiye girilmesine izin ver

Ekstra: deposit() ve withdraw() metodları ile para ekleme/çekme fonksiyonunu ekleyebilirsin.*/

	int chance = 3;
	boolean success = false;//Kullanıcının hesap numarasını doğru girip girmediğini tutuyor.Yani true ise hesap numarası geçerli, false ise geçersiz.

	BankAccount bankAccount = new BankAccount();
	System.out.println("*******WELCOME TO ATM*******");
	Scanner scanner = new Scanner(System.in);
	while (chance > 0 && !success) {
		System.out.print("Please enter account number as 5 number: ");
		String account_number = scanner.nextLine();
		success = bankAccount.setAccount_number(account_number);
		if (!success) {
			chance--;
			System.out.println("Your remaining chance: " + chance);
		}
	}
	if (!success) {
        System.out.println("Access denied. No chances left.");
        return; // programı sonlandır
    }
	while (true) {
		System.out.print("1-Check the balance\n2-Deposit\n3-Withdraw\nq-To exit\nChoose the action you want to perform:");
		String entered = scanner.nextLine();
		if (entered.equals("1")) {  //stringler için== kullanamazsın. .equals() kullanman lazım.
			bankAccount.getBalance();
		} else if (entered.equals("2")) {
			bankAccount.getBalance();
			System.out.print("Enter the amount of money which you want to deposit: ");
			double deposit_ = scanner.nextDouble();
			bankAccount.deposit(deposit_);
			scanner.nextLine(); // <-- Enter’ı temizle
		} else if (entered.equals("3")) {
			bankAccount.getBalance();
			System.out.println("Enter the amount of money which you want to withdraw: ");
			double withdraw_ = scanner.nextDouble();
			scanner.nextLine(); // <-- Enter’ı temizle
			bankAccount.withdraw(withdraw_);
		} else if (entered.equals("q")) {
			System.out.println("The program is closing...");
			break;
		}
		else {
			System.out.println("Invalid value. Please try again!");
		}
	}
}

}
