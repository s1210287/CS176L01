package cs176.s1210287;
public class Tester2 {

	public static void main(String[] args) {

		Class2 test2 = new Class2(100);


		test2.load();

		test2.search(1);
		
		test2.findMax();

		test2.findMin();

		test2.findMaxPos();

		test2.findMinPos();
	

		System.out.println("Was the number '22' in the array: " + test2.search(22));

		System.out.println("The maximum value is: " + test2.findMax());

		System.out.println("The minimum value is: " + test2.findMin());

		System.out.println("The maximum value index position is: " + test2.findMaxPos());

		System.out.print("The minimum value index position is: " + test2.findMinPos());



	}



}