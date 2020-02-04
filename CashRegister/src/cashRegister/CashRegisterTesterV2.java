package cashRegister;

import java.util.Scanner;

public class CashRegisterTesterV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CashRegisterV2 cash = new CashRegisterV2();
		
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
			cash.recordPurchase(costPurchase);
		}
		System.out.print("Enter a payment amount: ");
		double amountPaid = in.nextDouble();
		cash.receivePayment(amountPaid);
		cash.giveChange();
		cash.printChange();
}
}

