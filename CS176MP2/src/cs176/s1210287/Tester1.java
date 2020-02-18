package cs176.s1210287;
public class Tester1 {

	public static void main(String[] args) {

		Class1 Test1 = new Class1();

		Test1.load();

		System.out.println("Is the string 'KTS' in the array:  " + Test1.search("KTS"));

		System.out.println("The max in the ordering is: " + Test1.findMax());

		System.out.println("The min in the ordering is: " + Test1.findMin());


		System.out.println("The longest string is: " + Test1.findLongest());
		
		System.out.println("The shortest string is: " + Test1.findShortest());

	}


}