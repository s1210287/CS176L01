import java.util.Random;
public class VenueTester {

	public static void main(String[] args) {

		Random in = new Random();
		
		Venue center = new Venue(4,5,10);
		
		int section = 0;

		int row = 0;

		int seat = 0;

		int counter = 0;

		final int SEAT = 100;


		while(counter!= SEAT){

			section = in.nextInt(4) + 1;

			row = in.nextInt(5) + 1;

			seat = in.nextInt(10) + 1;

			if(center.seatLookup(section,row,seat) == true) {

				System.out.println("You won, this is your seat location: Section: " + section + ": Row: " + row + ": Seat: " + seat);

				counter++;

				
				}

			else if((center.seatLookup(section,row,seat) == false)) {

				System.out.println("Sorry you did not win a seat");

			}
			

		}

		System.out.print("Total amount of seats awarded: " + counter);

	}
}