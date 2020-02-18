package cs176.s1210287;
import java.util.Scanner;

public class Class2 {



	Scanner in = new Scanner(System.in);

	int counter = 0;

	//
	
	int[] intArray;

	public Class2(int cap) {

		counter = cap;

	}

	public void load() {

		int [] integers = new int[counter];

		System.out.print("Enter an integer followed by any letter to quit: ");

		counter = 0;

		for (int i = 0; i < integers.length; i++) {

			if(in.hasNextInt()) {

				integers[i] = in.nextInt();

				counter++;

			}

		}

		intArray = new int[counter];

		for (int i = 0; i < counter; i++) {

			intArray[i] = integers[i];

		}

	}

	public boolean search(int Num) {

		boolean number = false;

		for (int i = 0; i < counter; i++) {

			if (Num == intArray[i]) {

				number = true;

			}

		}

		return number;

	}

	public int findMax() {

		int maximum = Integer.MIN_VALUE;

		for (int i = 0; i < counter; i++) {

			if (intArray[i] > maximum) {

				maximum = intArray[i];

			}

		}

		return maximum;

	}

	public int findMin() {

		int minimum = Integer.MAX_VALUE;

		for (int i = 0; i < counter; i++) {

			if (intArray[i] < minimum) {

				minimum = intArray[i];

			}

		}

		return minimum;

	}

	public int findMaxPos() {

		int maximum = Integer.MIN_VALUE;

		int maxPos = 0;

		for (int i = 0; i < counter; i++) {

			if (intArray[i] > maximum) {

				maximum = intArray[i];

				maxPos = i;

			}

		}

		return maxPos;

	}

	public int findMinPos() {

		int minimum = Integer.MAX_VALUE;

		int minPos = 0;

		for (int i = 0; i < counter; i++) {

			if (intArray[i] > minimum) {

				minimum = intArray[i];

				minPos = i;

			}

		}

		return minPos;
	}

}