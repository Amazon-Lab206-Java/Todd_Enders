import java.util.Random;
public class BankAccount {
	private String accountNo;
	private double checkingBal;
	private double savingsBal;
	private static int numAccounts;
	private static double totalMoney;
	
	public BankAccount() {
		accountNo = generateAccount();
		numAccounts++;
		checkingBal = 0;
		savingsBal = 0;
	}
	
	private String generateAccount() {
		Random rand = new Random();
		String account = "";
		String digits = "0123456789";
		for (int i = 0; i < 10; i++) {
			account += digits.charAt(rand.nextInt(10));
		}
		return account;
	}
	
	public double getSavingsBalance() {
		return savingsBal;
	}
	
	public double getCheckingBalance() {
		return checkingBal;
	}
	
	public void deposit(double amount, String account) {
		if (account == "checking") {
			checkingBal += amount;
			totalMoney += amount;
		}else if(account == "savings") {
			savingsBal += amount;
			totalMoney += amount;
		}else {
			System.out.println("Not a valid account, choose 'checking' or 'savings'");
		}
	}
	
	public void withdraw(double amount, String account) {
		if (account == "checking") {
			if (checkingBal - amount >= 0) {
				checkingBal -= amount;
				totalMoney -= amount;
			}else {
				System.out.println("Insufficient checking funds");
			}
		}else if (account == "savings") {
			if (savingsBal - amount >= 0) {
				savingsBal -= amount;
				totalMoney -= amount;
			}else {
				System.out.println("Insufficienct savings funds");
			}
		}else {
			System.out.println("Not a valid account, choose 'checking' or 'savings'");
		}
	}
	
	public void printTotalMoney() {
		System.out.println("Total Funds: "+(checkingBal+savingsBal));
	}
	
	public int getNumAccounts() {
		return numAccounts;
	}
	
	public double getEntireMonies() {
		return totalMoney;
	}
}
