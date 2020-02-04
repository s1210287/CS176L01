package cashRegister;

import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CashRegister register = new CashRegister();
		
		final double SENTINEL = -1;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an amount to purchase or -1 to stop: ");
		
		while(in.hasNextDouble()) 
		{
			double costPurchase = in.nextDouble();
			if(costPurchase == SENTINEL) 
			{
				break;
			}
			System.out.print("Enter an amount to purchase or -1 to stop: ");
			register.recordPurchase(costPurchase);
		}
		System.out.print("Enter a payment amount: ");
		double amountPaid = in.nextDouble();
		register.receivePayment(amountPaid);
		register.giveChange();
		register.printChange();
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
