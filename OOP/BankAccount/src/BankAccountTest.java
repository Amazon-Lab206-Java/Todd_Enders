
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount();
		BankAccount ba2 = new BankAccount();
		System.out.println(ba.getNumAccounts());
		ba.deposit(500, "checking");
		ba2.deposit(1000, "savings");
		ba.printTotalMoney();
		ba2.printTotalMoney();
		System.out.println(ba.getEntireMonies());
	}

}
