package bank;

public class Account {
	private int balance;

	public Account() {
		
		this.balance = 0;
	}
	
	public Account(int amount) {
		
		deposite(amount);
	}
	
	

	public int getBalance() {
		return balance;
	}

	public void deposite(int amount) {
		
		if(amount<0) {
			System.out.println("Invalid Deposite Amount");
		}
		else {
			balance= balance+amount;
			System.out.println("Deposite Amount Successful");

		}
	}
	public void withdraw(int withdrawAmount) {
		if(balance > 0) {
			if(withdrawAmount < balance)
			{
				if(withdrawAmount > 0) {
					balance= balance- withdrawAmount;
					System.out.println("Balance withdraw successfully");
					}
				else {
					System.out.println("Balance withdraw Unsuccessfully");

				}
			}
			else {
				System.out.println("Insufficient Balance");

			}
		}
		else
		{
			System.out.println("Balance is 0");

		}
	}

	

}
