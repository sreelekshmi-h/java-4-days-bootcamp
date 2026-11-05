package proj;

public class Question1 {

	public static void main(String[] args) {
		BankAccount obj=new BankAccount("sree",123,1500);
		
		obj.deposit(100);
		System.out.println(obj.balance);
		obj.withdraw(200);
		System.out.println(obj.balance);
		obj.displayDetails();
		
	
	}
}
	
	class BankAccount{
	String accountHolder;
	int accountNumber;
	double balance;
	 BankAccount(String accountHolder,int accountNumber,double balance) {
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	double deposit(double amount) {
		balance+=amount;
		return balance;
	}
	
	double withdraw(double amount) {
		balance-=amount;
		return balance;
	}
	
	void displayDetails() {
		System.out.printf("accountHolder:%s,accNo:%d,balance:%f",accountHolder,accountNumber,balance);
	}
	}
	

