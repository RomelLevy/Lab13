import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String choice = "y";
		char player;
		Player p = null;
		String name;

		Mike m = new Mike();
		Tom t = new Tom();

		System.out.println("Welcome to ROCK, PAPER, SCISSORS! ");

		name = Validator.get_String("Enter your name : ");
		String playerChoice = Validator.get_String("Would you like to play Mike or Tom?(M/T): ");

		player = playerChoice.charAt(0);

		if (player == 'm' || player == 'M')
			p = m;
		else if (player == 't' || player == 'T')
			p = t;

		if (playerChoice.charAt(0) == 'm' || playerChoice.charAt(0) == 'M')
			playerChoice = "Mike";
		else if (playerChoice.charAt(0) == 't' || playerChoice.charAt(0) == 'T')
			playerChoice = "Tom";
		p.setName(playerChoice);

		while (choice.compareTo("y") == 0) {

			System.out.print("Rock, paper or scissors?(R/P/S) : ");

			String rps = scnr.next();
			Player1 p1 = new Player1();
			p1.setName(name);
			p1.setResponse(rps);

			if (rps.charAt(0) == 'r' || rps.charAt(0) == 'R')
				rps = "Rock";
			else if (rps.charAt(0) == 'p' || rps.charAt(0) == 'P')
				rps = "Paper";
			else if (rps.charAt(0) == 's' || rps.charAt(0) == 'S')
				rps = "Scissors";
			System.out.println(name + " : " + rps);
			

			String roshambo = p.generateRoshambo().toString();
			System.out.println(p.getName() + " : " + roshambo);
			
			

			if (Character.toUpperCase(rps.charAt(0)) == roshambo.charAt(0))
				System.out.println("Draw!");

			else if (rps.equals("Paper") && roshambo.equals("Rock"))
				System.out.println(p1.getName() + " Wins");

			else if (roshambo.equals("Paper") && rps.equals("Rock"))
				System.out.println(p.getName() + " Wins");

			else if (rps.equals("Paper") && roshambo.equals("Scissors"))
				System.out.println(p.getName() + " Wins!");

			else if (roshambo.equals("Paper") && rps.equals("Scissors"))
				System.out.println(p1.getName() + " Wins!");

			else if (rps.equals("Scissors") && roshambo.equals("Rock"))
				System.out.println(p.getName() + " Wins");

			else if (roshambo.equals("Scissors") && rps.equals("Rock"))
				System.out.println(p1.getName() + " Wins");

			// see if the user wants to continue
			choice = Validator.getString("Play again?(y/n): ");
			System.out.println();

		}

	}

}
