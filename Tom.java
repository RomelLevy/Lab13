import java.util.Random;

public abstract class Tom extends Player {

	public Tom() {

		name = "Tom";
	}

	@Override
	public Roshambo generateRoshambo() { // randomly selects rock,paper, or scissors

		Random r = new Random();
		int ch = r.nextInt(3);
		if (ch == 0)
			return Roshambo.ROCK;
		else if (ch == 1)
			return Roshambo.PAPER;
		else
			return Roshambo.SCISSORS;
	}

}
