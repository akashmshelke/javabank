package org.sunbeam.karad;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank implements IBank{

	ArrayList<Account> accts = new ArrayList<>();

	public static ArrayList<Account> Accounts() {
		ArrayList<Account> accts = new ArrayList<>();
		accts.add(new Account(1, "Akash", "a@gmail.com", "9527", 150));
		accts.add(new Account(2, "Mayur", "m@gmail.com", "8668", 1000));
		accts.add(new Account(3, "Jayesh", "j@gmail.com", "9421", 1200));
		return accts;
	}

	public void OpenAccount(Account acct) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Accts no : ");
		acct.setAccno(sc.nextInt());
		System.out.println("Enter Accts name : ");
		acct.setName(sc.next());
		System.out.println("Enter Accts email : ");
		acct.setEmail(sc.next());
		System.out.println("Enter Accts phone : ");
		acct.setPhone(sc.next());
		System.out.println("Enter Accts Bal : ");
		acct.setBalance(sc.nextInt());
		accts.add(acct);
	}

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Account> getAccts() {
		return accts;
	}

	public void setAccts(ArrayList<Account> accts) {
		this.accts = accts;
	}

	public void DisplayAllAccounts() {

		for (Account account : accts) {
			System.out.println(account);
		}
	}

	public void DisplayAnAccount(int acctNo) {

		for (Account account : this.accts) {
			if (account.getAccno() == acctNo) {
				System.out.println(account);
			}
		}
	}

	public void RemoveAccount(int acctNo) {
		ArrayList<Account> accounts = new ArrayList<>();
		for (Account account : this.accts) {
			if (account.getAccno() != acctNo) {
				accounts.add(account);
				this.setAccts(accounts);
				System.out.println(accounts.size());
			}
		}
		
	}

	public void Withdraw(int acctNo,int amt) {
		
		for (Account account : this.accts) {
			if (account.getAccno() == acctNo) {
				account.setBalance(account.getBalance()-amt);
			}
		}
	}


	public void Deposit(int acctNo,int amt) {
		
		for (Account account : this.accts) {
			if (account.getAccno() == acctNo) {
				account.setBalance(account.getBalance()+amt);
			}
		}
	}
	
	public void Transfer(int sAcctNo,int dAcctNo, int amt) {
		
		for (Account account : this.accts) {
			if (account.getAccno() == sAcctNo) {
				account.setBalance(account.getBalance()-amt);
			}
			if (account.getAccno() == dAcctNo) {
				account.setBalance(account.getBalance()+amt);
			}
		}
	}

	@Override
	public void serachByName(String name) {
		for (Account account : accts) {
			if(account.getName().equals(name))
			{
				System.out.println(account);
			}
		}
		
	}

}
