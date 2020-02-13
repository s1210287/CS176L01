package cs176.s1210287;

import java.util.Scanner;
import java.util.Arrays;

public class Class2 {

	Scanner in = new Scanner(System.in);

	final int MAX_ARRAY_SIZE = 100;

	int arraySize = 0;

	int count = 0;

	String load = "";

	String max = "";

	String min = "";
	
	String longest= "";

	String shortest = "";

	boolean fin = false;
	
	String [] stringArray;

	

	public  Class2() {

		stringArray = new String[MAX_ARRAY_SIZE];

	}

	public void load () {



		System.out.println("Enter some strings or enter FIN to finish: ");

		

		while (fin == false ) {

			load = in.next();

			if (load.contentEquals("FIN")) {

				fin = true;

				count--;

				}

			else {

				stringArray[count] = load;
				
				if (count == 1 ) {

					if (stringArray[count].compareTo(stringArray[count-1]) < 0) {

					max = stringArray[count];

					min = stringArray[count-1];

					count++;

					}

					else {

						min =stringArray[count-1];

						max = stringArray[count];

						count++;

					}

				}

				else if (count > 1) {

					if (stringArray[count].compareTo(min) < 0){

							min = stringArray[count];

					}//if

					if (stringArray[count].compareTo(max) > 0){

							max = stringArray[count];

					}

					count++;

				}

				else

					count++;
			}

		}

	}

	public boolean search(String inWord) {

		boolean isInArray = false;

		for (int i = 0; i <= count; i++) {

			if (stringArray[i].contentEquals(inWord))

					isInArray = true;
		}

		return isInArray;

	}

	public void findMax() {

		System.out.println(max + " is the max");

	}

	public void findMin() {

		System.out.println(min + " is the min");

	}

	public String findLongest() {

		String longest = "";

		for(int i = 0; i <= count; i++) {

			if (stringArray[i].length() > longest.length()) {

				longest = stringArray[i];
			}
		}

		return longest;
	}

	public String findShortest() {

		String shortest = "";

		int shortCounter = 0;

		String multipleShortest = "";

		for(int i = 0; i <= count; i++) {

			if (i == 0) {

				shortest = stringArray[i];

				shortCounter = 1;

				multipleShortest = stringArray[i];

			}

			else if (stringArray[i].length() < shortest.length()) {

				shortest = stringArray[i];

				count = 1;

			}

			else if (stringArray[i].length() == shortest.length()) {

				multipleShortest = multipleShortest + ", and " + stringArray[i];

				shortCounter++;

			}

		}

		if (shortCounter == 1)

			return shortest;

		else

			return multipleShortest;

	}

}
