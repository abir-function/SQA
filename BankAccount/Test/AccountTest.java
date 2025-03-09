import static org.junit.Assert.*;

import org.junit.Test;

import bank.Account;
import junit.framework.Assert;

public class AccountTest {

	//1. account create with default constructor
	@SuppressWarnings("deprecation")
	@Test
	public void test1() {
		Account acc = new Account();
		Assert.assertEquals(0, acc.getBalance());
	}
	
	//2. Creating an account with initial balance
	@SuppressWarnings("deprecation")
	@Test
	public void test2() {
		Account acc = new Account(500);
		Assert.assertEquals(500, acc.getBalance());
	}
		
	 //3. Creating an account with initial balance
	@SuppressWarnings("deprecation")
	@Test
	public void test3() {
		Account acc = new Account();
		acc.deposite(1000);
		Assert.assertEquals(1000, acc.getBalance());	
	}
		
	//4. Withdrawing a Valid Amount
	@SuppressWarnings({ "deprecation", "deprecation" })
	@Test
	public void test4() {
		Account acc = new Account();
		acc.deposite(1000);
		acc.withdraw(500);
		Assert.assertEquals(500, acc.getBalance());	
	}	
		
	//5. Attempting to Deposite a Negative Amount
	@SuppressWarnings("deprecation")
	@Test
	public void test5() {
		Account acc = new Account();
		acc.deposite(-100);
		Assert.assertEquals(0, acc.getBalance());	
	}
	
	//6. Attempting to withdraw when balance is 0
		@SuppressWarnings("deprecation")
		@Test
		public void test6() {
			Account acc = new Account();
			acc.withdraw(1000);
			Assert.assertEquals(0, acc.getBalance());	
		}
		
	//7. Attempting to withdraw  an amount Greater than the Available Balance
	
		@SuppressWarnings("deprecation")
		@Test
		public void test7() {
			Account acc = new Account(1500);
			acc.withdraw(2000);
			Assert.assertEquals(1500, acc.getBalance());	
		}
		
		//8. Attempting to withdraw Negative Amount
		
			@SuppressWarnings("deprecation")
			@Test
			public void test8() {
				Account acc = new Account(1500);
				acc.withdraw(-200);
				Assert.assertEquals(1500, acc.getBalance());	
			}
		

		

	
		
	
	

}
