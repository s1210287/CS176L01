import java.util.Scanner;

public class Class2 {

	private int [] integerArray; //instance variable
	private int howMany; //extra
	/**
	 *  constructs an integer array with a maximum capacity
	 */
	public Class2 (int capacity) //constructor
	{
		integerArray = new int[capacity];
		howMany=0;
	}
	public void load() //not returning = void or taking anything in
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Please enter values, Q to quit:");
		//while loop
		while (in.hasNextInt()) {
			String arraySize = in.next();
			if(arraySize=="Q") {
				break;
			}
		}
	}
		public boolean search(int inNum) 
		{
			for (i<=howMany) //for loop
				integerArray[i]
		}
		public int findMax()
		{
			int largest = integerArray[0]; //value that is returned
			for (i>largest)
			//another for loop
		}
		public int findMin()
		{
			int smallest = integerArray[0];
		}
		public int findMaxPos()
		{
			
		}
		public int findMinPos()
		{
			
		}
	
}
