package cs176.s1210287;

import java.util.Scanner;

public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		Class1 integer = new Class1();
		
		boolean inArray = false;

		int searchFor = 0;

		int max = 0;

		int min = 0;

		String maxPos ="";

		String minPos = "";

		integer.load();

		inArray = integer.search(searchFor);

		System.out.println(inArray);

		max = integer.findMax();

		System.out.println(max + " is the max");

		min = integer.findMin();

		System.out.println(min + " is the min");

		maxPos = integer.findMaxPos();

		System.out.println(maxPos + " is the maxPosition");

		minPos = integer.findMinPos();

		System.out.println(minPos + " is the minPosition");

		}
}
