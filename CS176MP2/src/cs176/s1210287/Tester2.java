package cs176.s1210287;

import java.util.Scanner;
			
public class Tester2 {
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Class2 string = new Class2();
		
		String inArray = "Hi";

		boolean isInArray = false;

		string.load();

		String longest = "";

		String shortest = "";

		isInArray = string.search(inArray);

		if (isInArray == true)

			System.out.println("The string " + inArray + " is in the array.");

		else

			System.out.println("The string " + inArray + " is not in the array.");

		string.findMax();

		string.findMin();

		longest = string.findLongest();

		System.out.println(longest + " is the longest");

		shortest = string.findShortest();

		System.out.println(shortest +" is the shortest");

		

	}
}