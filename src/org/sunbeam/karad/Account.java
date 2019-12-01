package org.sunbeam.karad;

import java.util.Scanner;

public class Account {

	
	private int accno;
	private String name;
	private String email;
	private String phone;
	private int balance;
	private Bank bank = new Bank();
	

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accno, String name, String email, String phone, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
	}
	
	
	
	
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", email=" + email + ", phone=" + phone + ", balance="
				+ balance + "]";
	}

}
