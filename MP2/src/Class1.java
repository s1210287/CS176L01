import java.util.Scanner;

public class Class1 {
	
		private String [] StringArray; 
		private int howMany;
		
	public Class1 (String capacity) //constructor
	{
		StringArray = new String[capacity];
		howMany=0;
	}
	public void load() //not returning = void or taking anything in
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Please enter values, Q to quit:");
		//while loop
		while (in.hasNext()) {
			String arraySize = in.next();
			if(arraySize=="Q") {
				break;
			}
		}
	}
		public boolean search(String inWord) 
			{
				for (i<=howMany) //for loop
					integerArray[i]
			}
			public String findMax()
			{
				int largest = StringArray[0]; //value that is returned
				for (i>largest)
					//another for loop
			}
			public String findMin()
			{
				int smallest = StringArray[0];
			}
			public String findLongest()
			{
				String longest = StringArray[0]
			}
			public String findSmallest()
			{
				String shortest = StringArray[0]
			}

		}
