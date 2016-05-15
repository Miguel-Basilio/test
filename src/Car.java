import java.util.Scanner;

import test.AutoMobile;

public class Car {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numberOfDice;
		int operatingCycle;

		boolean again = true;

		game game = new game();

		while (again) {

			System.out.printf("Enter number of dice: ");
			numberOfDice = input.nextInt();

			int diceRolled = game.rollDice(numberOfDice);

			AutoMobile auto1 = new AutoMobile(2016, "Ford", "Truck", "white", "F150", 8);

			AutoMobile auto2 = new AutoMobile(2016, "Toyota", "Van", "green", "Camry", 6);

			AutoMobile auto3 = new AutoMobile(2016, "Honda", "Sport Car", "red", "Civic", 4);

			int counter = 0;
			
			while (counter != diceRolled) {
				auto1.setOperatingCyle(diceRolled);
				auto1.currentGear(3);

				auto2.setOperatingCyle(diceRolled);
				auto2.currentGear(4);

				auto3.setOperatingCyle(diceRolled);
				auto3.currentGear(5);
				counter++;
			}

			auto1.displayAuto();
			System.out.printf("Current speed: %d\n", auto1.currentSpeed());
			System.out.printf("Distance traveled: %f\n\n", auto1.distanceTravel());

			auto2.displayAuto();
			System.out.printf("Current speed: %d\n", auto2.currentSpeed());
			System.out.printf("Distance traveled: %f\n\n", auto2.distanceTravel());

			auto3.displayAuto();
			System.out.printf("Current speed: %d\n", auto3.currentSpeed());
			System.out.printf("Distance traveled: %f\n\n", auto3.distanceTravel());

			System.out.printf("\nEnter 1 to run again: ");
			int playAgain = input.nextInt();
			if (playAgain != 1)
				again = false;

		}

	}

}