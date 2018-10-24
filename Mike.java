
public abstract class Mike extends Player {

	public Mike() {

		name = "Mike";
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
