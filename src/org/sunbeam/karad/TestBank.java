package org.sunbeam.karad;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBank {

	public static int menu() {
		Scanner sc = new Scanner(System.in);

		int choice;

		System.out.println("1. Add Account");
		System.out.println("2. Display All Account");
		System.out.println("3. Display an Accounts");
		System.out.println("4. Remove an Account");
		System.out.println("5. withdraw ");
		System.out.println("6. deposit ");
		System.out.println("7. transfer");
		System.out.println("8. search account using name");
		System.out.println("9. search account using email");
		System.out.println("10. search account using phone");
		System.out.println("11. exit.");
		System.out.println("Enter choice  : ");
		choice = sc.nextInt();

		return choice;
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		int choice = 0;
		int acctNo = 0;
		int amt=0;
		bank.setAccts(Bank.Accounts());
		while ((choice = TestBank.menu()) != 0) {
			switch (choice) {
			case 1:
				Account a = new Account();
				bank.OpenAccount(a);
				break;
			case 2:
				bank.DisplayAllAccounts();
				break;
			case 3:
				System.out.println("Enter Acc no");
				acctNo = sc.nextInt();
				bank.DisplayAnAccount(acctNo);
				break;
			case 4:
				System.out.println("Enter Acc no");
				acctNo = sc.nextInt();
				bank.RemoveAccount(acctNo);
				
				break;
			case 5:
				System.out.println("Enter Acc no");
				acctNo = sc.nextInt();
				System.out.println("Enter Amount to withdraw : ");
				amt = sc.nextInt();
				bank.Withdraw(acctNo, amt);
				break;
			case 6:
				System.out.println("Enter Acc no");
				acctNo = sc.nextInt();
				System.out.println("Enter Amount to deposit : ");
				amt = sc.nextInt();
				bank.Deposit(acctNo, amt);
				break;
			case 7:
				System.out.println("Enter source Acc no");
				int sAcctNo = sc.nextInt();
				System.out.println("Enter dest Acc no");
				int dAcctNo = sc.nextInt();
				System.out.println("Enter trf Amount: ");
				amt = sc.nextInt();
				bank.Transfer(sAcctNo, dAcctNo, amt);
				
				break;
			case 8:
				System.out.println("Enter name");
				String name = sc.next();
				bank.serachByName(name);
				
				break;
			}

		}

	}

}
