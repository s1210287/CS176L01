package bank;

public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     //This line creates a new BankAccount object called harrysChecking with 0 balance
		BankAccount harrysChecking = new BankAccount();
		BankAccount sallysChecking = new BankAccount(1000);	
		//This line calls the deposit method for harrysChecking
				  //Note the deposit is for $2000
			      harrysChecking.deposit(2000);  //deposit is a method
			      
			      
			      //This line calls the withdrawal method for harrysChecking
			      //Note the withdrawal is for $500
			      harrysChecking.withdraw(500);
			      sallysChecking.deposit(300);
			      sallysChecking.withdraw(700);
			      sallysChecking.withdraw(700);
			      
			      //This line calls the getBalance method and prints it     
			      System.out.println(harrysChecking.getBalance());  
			      System.out.println("Expected: 1500"); 
			      System.out.println(sallysChecking.getBalance());
			      System.out.println("Expected: 600");  
	}

}
