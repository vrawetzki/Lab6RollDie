import java.util.Random;
import java.util.Scanner;

public class Lab6DiceRoll {
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to the Grand Circus Casino!");
	System.out.println("How many sides should each dir have?");
	
	boolean cont = true;
	int sidesOfDice;
	int rollNumber = 1;
	
	while (cont == true) {
		System.out.print("How many sides should each die have? ");
		sidesOfDice = scan.nextInt();
		int roll1 = generateRandomDieRoll(sidesOfDice);
		int roll2 = generateRandomDieRoll(sidesOfDice);
		System.out.println("Roll " + rollNumber + ": ");
		System.out.println(roll1);
		System.out.println(roll2);
		checkForSpecial(roll1, roll2, sidesOfDice);

		// get continue prompt from user
		System.out.print("Roll again?? (y/n): ");
		scan.nextLine();
		String keepGoing = scan.nextLine();
		cont = checkForContinue(keepGoing);
		rollNumber++;

	}
	System.out.println("Goodbye!");
	scan.close();

}

public static int generateRandomDieRoll(int num) {
	Random rnd = new Random();
	int roll1 = rnd.nextInt(num);
	return roll1 + 1;
}

public static void checkForSpecial(int roll1, int roll2, int dieSides) {
	if ((roll1 + roll2) == 7 || (roll1 + roll2 == 11)) {
		System.out.println("Craps");
	} else if (roll1 == 1 && roll2 == 1 && dieSides != 2) {
		System.out.println("Snake eyes");
	} else if (roll1 == 6 && roll2 == 6) {
		System.out.println("Box Cars");
	} else if (roll1 == 20 || roll2 == 20 && dieSides == 20) {
		System.out.println("NATURAL 20!");
	} else if (dieSides == 2) {
		System.out.println("So you're flipping a coin?");
	}else if (roll1 == 1 || roll2 == 1 && dieSides == 20) {
		System.out.println("Natural 1 :(");
	}else {
		
	}
}

public static boolean checkForContinue(String check) {
	if (check.equalsIgnoreCase("y")) {
		return true;
	} else {
		return false;
	}

}

}