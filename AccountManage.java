package basic;

public class AccountManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		System.out.println(acc.getId());
		Account acc1 = new Account(10,5.000);
		acc1.OutputAccount();
		
		Account acc3 = new Account();
		
		Account acc2 = new Account(acc3);
		acc2.OutputAccount();
	}

}
