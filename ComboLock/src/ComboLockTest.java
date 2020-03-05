import java.util.Scanner;

public class ComboLockTest {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Combolock Dem = new Combolock(10,20,30);

		int count = 0;

		int forty = 40;
		
		int zero = 0;

		int tick = 0;


		Dem.reset();


		System.out.println("Enter a number of ticks to turn to the right 0-39 or any invalid number to quit: ");

		while(in.hasNextInt()) {

			tick = in.nextInt();

			Dem.turnRight(tick);

			count++;

			if(tick > 0 && tick < forty) {

				System.out.println("Enter a number of ticks to the left 0-39 or any invalid number to quit: ");

				tick = in.nextInt();

				Dem.turnLeft(tick);

				count++;

				System.out.print("Enter a number of ticks to the right 0-39 or any invalid number to quit: ");

				tick = in.nextInt();

				Dem.turnRight(tick);

				count++;

			}

			if(count == 3) {

				break;

			}

			else if(tick < zero || tick > forty) {

				break;

			}

		

		}
		System.out.println(Dem.open());

	}



}