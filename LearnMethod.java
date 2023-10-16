package week1.day2;

public class LearnMethod {

private	int balance ;


	public void depositamount(int amount) {
		balance = amount;
		System.out.println(amount);
	}

	private int getBalance() {
		return balance;
	}
	
	
	public String getBicycleColour() {
		return "black";

	}	
	
	public boolean isPrimeNumber() {
		return true;

	}
	
	public float addtwonumbers(int num1, float num2) {
		float result = num1+num2 ;
		return result;

	}
	

	public static void main(String[] args) {
		
		LearnMethod bank = new LearnMethod();
		bank.depositamount(22);
		System.out.println(bank.balance); //why is it no 0 ?
		System.out.println(bank.getBicycleColour());
		System.out.println(bank.addtwonumbers(22, 333.333f));
		System.out.println(bank.isPrimeNumber());
	
	}
}

