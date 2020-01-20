package Challenge2;

public class BankAccountDemo {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(1500.0);
		BankAccount account2 = new BankAccount(account1);
		System.out.println("The balance in account 1: $"+account1.getBalance());
		System.out.println("The balance in account 2: $"+account2.getBalance());
	}

}
