package com.Sanu.Cust;



import com.Sanu.Bank.BankAccount;
import com.Sanu.Bank.CurrentAccount;
import com.Sanu.Bank.CurrentAccountVer_2;
import com.Sanu.Bank.SavingsAccount;
import com.Sanu.Bank.SavingsAccountVer_2;

public class Customer1 {
	
	public static void main(String[] args) {
		/*BankAccount acc=null;
		acc=new SavingsAccount();
		System.out.println(acc);*/
		
		
		SavingsAccountVer_2 savAccount=new SavingsAccountVer_2();
		System.out.println(savAccount);
		
		CurrentAccountVer_2 curAccount=new CurrentAccountVer_2();
		System.out.println(curAccount);
		
	}

}
