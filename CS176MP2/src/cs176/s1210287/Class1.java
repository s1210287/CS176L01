package cs176.s1210287;

import java.util.Scanner;

public class Class1 {
		Scanner in = new Scanner(System.in);

		final int MAX_ARRAY_SIZE = 100;

		int arraySize = 0;

		int count = 0;

		int load = 0;

		int max = 0;

		String maxPos = "";
		
		int min = 0;

		String minPos = "";
		
		boolean fin = false;

		Integer [] integerArray;

		

		public  Class1() {

			integerArray = new Integer[MAX_ARRAY_SIZE];

		}

		public void load () {

			System.out.println("Enter some integers, or enter 2 to finish: ");

			

			while (fin == false ) {

				load = in.nextInt();

				if (load == 2) {

					fin = true;

					count--;

					}
				else {

					integerArray[count] = load;

					count++;

				}

			}

		}

		public boolean search(int inNum) {

			boolean inArray = false;

			for (int i = 0; i <= count; i++) {

				if(integerArray[i] == inNum)

					inArray = true;

			}

			return inArray;

		}

		public  int findMax() {

			for (int i =0; i <= count; i++) {

				if (i == 0)

					max = integerArray[i];

				else {

					if (integerArray[i] > max)

						max = integerArray[i];

				}

			} 

			return max;

		}

		public  int findMin() {

			for (int i =0; i <= count; i++) {

				if (i == 0)

					min = integerArray[i];

				else {

					if (integerArray[i] < min)

						min = integerArray[i];

				}

			} 

			return min;

		}

		public String findMaxPos() {

			String maxPos = "test";

			int maxCounter = 0;

			for (int i = 0; i <= count; i++) {

				if (maxCounter == 0) {

					if (integerArray[i] == max) {

						maxPos = String.valueOf(i);

						maxCounter++;

					}
				}

				else if (maxCounter > 0){

					if(integerArray[i] == max)

						maxPos = maxPos + ", and " + String.valueOf(i);

						maxCounter++;
				}			

			}

			return maxPos;

		}

		public String findMinPos() {

			int minCounter = 0;

			for (int i = 0; i <= count; i++) {

				if (minCounter == 0) {

					if (integerArray[i] == min) {

						minPos = String.valueOf(i);

						minCounter++;

					}

				}

				else if (minCounter > 0){

					if(integerArray[i] == min)

						minPos = minPos + ", and " + String.valueOf(i);

						minCounter++;

				}
					

			}

			return minPos;

		}

	}
