package Array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int[] reservation = { 0, 0, 0, 0, 0, 1, 1, 1, 0, 1 };

		while (true) {
			System.out.println("Do you want to reservation seat? (1(Y) OR 0(N))");
			int YesOrNo = scanner.nextInt();

			if (YesOrNo == 1) {
				System.out.println("---- Now available seat ----");
				System.out.println();
				System.out.print("seatNumber is : 1 2 3 4 5 6 7 8 9 10");
				System.out.println();
				System.out.print("Reservati is  : ");
				for (int i = 0; i < reservation.length; i++) {
					System.out.print(reservation[i] + " ");

				}

				System.out.println();
				while (true) {
					System.out.println("Which seat number would you like? ");
					int seatNum = scanner.nextInt();
					System.out.println();
					if (reservation[(seatNum - 1)] == 1) {
						System.out.println("Sorry, alreay booked");

					} else if (reservation[(seatNum - 1)] == 0) {
						System.out.println(seatNum + "  is booked ");
						reservation[(seatNum - 1)] = 1;
						break;
					}
				}
			} else {
				System.out.println("System completed");
				break;
			}

		}
	}
}
