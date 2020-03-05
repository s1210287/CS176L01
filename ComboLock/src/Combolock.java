public class Combolock {



	private boolean zero = false;

	private boolean one = false;

	private boolean two = false;

	private boolean three = false;

	private int move = 0;
	
	boolean open = false;

	private int now = 0;

	private int yes;

	private int yes2;

	private int yes3;


	public Combolock(int secret, int secret2, int secret3) {



		yes = secret;

		yes2 = secret2;

		yes3 = secret3;

	}

	public void reset() {

		move = 0;

		one = false;

		two = false;

		three = false;

	}


	public void turnLeft(int ticks) {

		move = move + 1;

		now = ((now + ticks) + 40) % 40;

		System.out.println("Current position is: " + now);

		if(move == 2 && now == yes2){

			two = true;

		}

	}

	public void turnRight(int ticks) {

		move = move + 1;

		now = ((now - ticks) + 40) % 40;

		System.out.println("Current position is: " + now);

		if(move == 1 && now == yes){

			one = true;

		}

		if(move == 3 && now == yes3){

			three = true;

		}

	}


	public boolean open() {

		if(one == true && two == true && three == true) {

			open = true;

			System.out.println("You opened the lock!");

		}

		else {

			open = false;
			
			System.out.println("You did not open the lock");

		}

		return open;

	}



}