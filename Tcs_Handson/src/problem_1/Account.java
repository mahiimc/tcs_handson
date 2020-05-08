package problem_1;


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

class AccountDemo {
	
	
		public static void main(String args[]){
			Account account1= new Account(7,"ewqkvae",168.0,67);
			Account account2= new Account(3,"mqclvcm",123.0,74);
			Account account3= new Account(57,"uenzjpt",164.0,98);
			Account account4= new Account(28,"hwzlblz",130.0,5);
			Account account5= new Account(4,"rmejckg",125.0,28);

			Account[] objArray= {account1,account2,account3,account4,account5};

			int obj1 = searchAccountByNumber(objArray, 63);
			System.out.println("Output after first search: "+obj1);

			int obj2= searchAccountByNumber(objArray, 4);
			System.out.println("Output after second search: "+obj2);
	}
	@SuppressWarnings("unused")
	public static int searchAccountByNumber(Account [] obj , int number) {
		int return_number=-1;
		Account account = new Account();
		account=null;
		for(int i=0;i<obj.length;i++) {
			if(obj[i].getNumber() == number) {
				account=obj[i];
				return_number =1;
		}
		}	
		return return_number;
	}
}
