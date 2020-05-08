package fourth_problem;

import java.util.Arrays;

class Account {
	private int number;
	private String acType;
	private double balance;
	private int noOfAccountHolders;


	public Account() {

	}

	public Account(int number, String acType, double balance, int noOfAccountHolders) {
		this.number = number;
		this.acType = acType;
		this.balance = balance;
		this.noOfAccountHolders = noOfAccountHolders;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAcType() {
		return acType;
	}

	public void setAcType(String acType) {
		this.acType = acType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getNoOfAccountHolders() {
		return noOfAccountHolders;
	}

	public void setNoOfAccountHolders(int noOfAccountHolders) {
		this.noOfAccountHolders = noOfAccountHolders;
	}
	public String toString() {
		return this.number+" "+this.acType+" "+this.balance+" "+this.noOfAccountHolders;
	}

}




public class AccountDemo {

	public static Account [] sortAccountByAcType(Account[] objArray) {
		int n =objArray.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0 ; j<n-i-1;j++) {
				if(objArray[j].getAcType().compareTo(objArray[j+1].getAcType()) > 0) {
					Account temp = objArray[j];
					objArray[j]= objArray[j+1];
					objArray[j+1] = temp;
				}	
			}
		}
		return objArray;
	}
	public static void main(String args[]){
		Account account1= new Account(20,"fvmirje",552.0,90);
		Account account2= new Account(40,"sfvwspp",385.0,66);
		Account account3= new Account(16,"tfypcof",807.0,13);
		Account account4= new Account(15,"gvkhywb",627.0,51);
		Account account5= new Account(29,"iglclrn",775.0,43);


		Account[] objArray= {account1,account2,account3,account4,account5};

		Account [] objArrayRes= sortAccountByAcType(objArray);
		for(Account ac : objArrayRes) {
			System.out.println(ac);
		}
	}}