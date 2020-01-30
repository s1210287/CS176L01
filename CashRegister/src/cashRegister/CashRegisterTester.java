package cashRegister;

//.import bank.BankAccount;

public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CashRegister harrysChecking = new CashRegister();
		 CashRegister katiesChecking = new CashRegister();
		 
		 harrysChecking.giveChange(100);
		 
	      System.out.println(harrysChecking.getPurchase());  
	      System.out.println("Expected: 1500"); 
	      System.out.println(katiesChecking.getPayment());
	}

}
/**
•	REVIEW Assignment for CS176
•	Create a class called CashRegister.
•	CashRegister will use two instance variables:
purchase (double) will be a total of all purchases made by the customer
payment (double) will be the amount the customer is submitting to pay for purchases.
•	CashRegister methods:
o	Constructor will create a cash register with purchase = 0 and payment = 0.
o	recordPurchase will record a sale and add the new sale amount to purchase
o	receivePayment will receive the amount paid by the customer into payment
o	giveChange will calculate and return the amount of change due to the customer (purchase – payment)
•	Create a tester called CashRegisterTester which will:
o	Create a CashRegister object
o	Use a loop to accept purchases from the screen until a SENTINEL value of -1 is typed
o	Accept the payment for the purchases
o	Calculate and print the amount of change due to the customer
•	Document all components of the CashRegister class
•	Run CashRegisterTester several times to achieve the results shown below

*/
