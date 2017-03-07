package players;

public class Main {

	public static void main(String[] args) {
		Bob bob = new Bob(new Sax());
		bob.perfomans();
		System.out
				.println("-------------------------------------------"
						+ "-------------------------------------------"
						+ "--------------------------------------------");
		Steve steve = new Steve(new Sax(), new Guitar(), new Drums());
		steve.perfomans();
	}

}
