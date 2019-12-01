package org.sunbeam.karad;

public interface IBank {
	
	public void DisplayAllAccounts();
	public void DisplayAnAccount(int acctNo);
	public void RemoveAccount(int acctNo);
	public void Withdraw(int acctNo,int amt);
	public void Deposit(int acctNo,int amt);
	public void Transfer(int sAcctNo,int dAcctNo, int amt);
	public void serachByName(String name);


}
