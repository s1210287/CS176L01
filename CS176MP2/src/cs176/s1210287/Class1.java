package cs176.s1210287;
import java.util.Arrays;

import java.util.Scanner;

public class Class1 {

	Scanner in = new Scanner(System.in);

	int count = 0;

	final int MAX_SIZE = 100;
	
	int z = 1;

	int  k = 0;

	final String BREAK = "FIN";

	String input;

	String max = "";

	String min = "";

	boolean out = false;
	
	//
	
	String [] stringArray;

	//constructor

	public Class1()

	{

		stringArray = new String[MAX_SIZE];

	}

	public void load() {

		System.out.print("Enter a series of strings or 'FIN' to stop: ");



		while(out == false) {

			input = in.next();

			if(input.equals("FIN")) {

				out = true;

				count--;

			}

			else {

				stringArray[count] = input;

				count++;

			}

		}

	}

	public boolean search(String array) {

		boolean exists = false;

		for (int i = 0; i <= count; i++) {

			if (stringArray[i].contentEquals(array))

				exists = true;

		}

		return exists;

	}


	public String findMin(){

		for(int i = 0; i <= count; i++) {

			if(i == k) {

				min = stringArray[i];

			}

			else {

				if(stringArray[i].compareTo(min) < 0) {

					min = stringArray[i];

				}

			}

		}

		return min;

	}

	public String findMax() {

		for(int i = 0; i <= count; i++) {

			if(i == 0) {

				max = stringArray[i];

			}

			else{

				if(stringArray[i].compareTo(max) > 0) {

					max = stringArray[i];

				}

			}

		}

		return max;

	}

	public String findLongest() {

		String longest = stringArray[0];

		for(int i = z; i <= count; i++) {

			if(stringArray[i].length() > longest.length()) {

				longest = stringArray[i];

			}



		}

		return longest;

	}

	public String findShortest() {

		String shortest = stringArray[0];

		for(int i = z; i <= count; i++) {

			if(stringArray[i].length() < shortest.length()) {

				shortest = stringArray[i];

			}

		}

		return shortest;
	}

}