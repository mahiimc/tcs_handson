package third_problem;
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
	

	private static Account searchAccountByBalance(Account[] objArray, double d) {
		Account account = new Account();
		account=null;
		for(int i=0;i<objArray.length;i++) {
			if(objArray[i].getBalance() == d) {
				account=objArray[i];
			}
		}
		
		return account;
	}
	
	public static void main(String args[]){
		Account account1= new Account(43,"bqhqoho",328.0,1);
		Account account2= new Account(95,"pbuyhuk",931.0,73);
		Account account3= new Account(74,"jkmxefn",34.0,18);
		Account account4= new Account(43,"rnoebjc",799.0,39);
		Account account5= new Account(17,"czwgofn",372.0,15);


		Account[] objArray= {account1,account2,account3,account4,account5};

		Account objResultArray1= searchAccountByBalance(objArray, 322.0);
		if(objResultArray1==null){
		System.out.println("Output after first search is null. ");
		}else{
		System.out.println("Displaying contents of result array: ");
		System.out.println(objResultArray1);
		}

		Account objResultArray2= searchAccountByBalance(objArray, 372);
		if(objResultArray2==null){
		System.out.println("Output after first search is null. ");
		}else{
		System.out.println("Displaying contents of result array: ");
		System.out.println(objResultArray2);
		}
		}

}
