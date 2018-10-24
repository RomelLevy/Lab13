public abstract class Player {

	public String name;
	public String response;
	private int RoshamboValue;

	public Player() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getResponse() {
		return response;
	}

	public abstract Roshambo generateRoshambo();

}
