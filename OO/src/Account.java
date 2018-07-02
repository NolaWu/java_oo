public class Account {
	String accountNo;
	double balance;
	Account(String accountNo,double balance){
		this.accountNo=accountNo;
		this.balance=balance;
	}
	void printAccData() {
		System.out.println("±b∏π:"+accountNo+" æl√B:"+balance);

	}
	public static void main(String[] args) {
		Account a=new Account("124654",50000.0);
		a.printAccData();
		CheckingAccount ca=new CheckingAccount("837444",18730.0,20);
		ca.printAccData();
		System.out.println("-------------------------");
		Account[] aa=new Account[2];
		aa[0]=new CheckingAccount("124654",50000.0,25);
		aa[1]=new CheckingAccount("837444",18730.0,20);
		for(int i=0;i<aa.length;i++) {
			System.out.println("------------------------");
			aa[i].printAccData();
			System.out.println("------------------------");
			System.out.println(aa[i].accountNo+" "+aa[i].balance+" ");
		}
		System.out.println(aa[0].toString());
		System.out.println(Integer.toHexString(aa[0].hashCode()));
		System.out.println(aa[0].equals(aa[1]));
	}
}
