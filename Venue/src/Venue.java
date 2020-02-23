	public class Venue {

		private boolean[][][] allSeats;


		public Venue(int section, int row, int seatnumber) {

			allSeats = new boolean[section][row][seatnumber];

			for(int i = 0; i < section; i++) {

				for(int j = 0; j < row; j++) {

					for(int k = 0; k < seatnumber; k++) {

						allSeats[i][j][k] = false;

					}

				}

			}

		}

		public boolean seatLookup(int section2, int row2, int seatnumber2) {

			if(allSeats[section2-1][row2-1][seatnumber2-1] == true) {

				return false;

			}

			else { 

				if(allSeats[section2-1][row2-1][seatnumber2-1] ==  false) {

					allSeats[section2-1][row2-1][seatnumber2-1] = true;

				}

				return true;

			}

		}

	}

