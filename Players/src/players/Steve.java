package players;

public class Steve implements Instrumentalist {
	private Sax sax;
	private Guitar guitar;
	private Drums drums;

	public Steve(Sax sax, Guitar guitar, Drums drums) {
		super();
		this.sax = sax;
		this.guitar = guitar;
		this.drums = drums;
	}

	public Sax getSax() {
		return sax;
	}

	public void setSax(Sax sax) {
		this.sax = sax;
	}

	public Guitar getGuitar() {
		return guitar;
	}

	public void setGuitar(Guitar guitar) {
		this.guitar = guitar;
	}

	public Drums getDrums() {
		return drums;
	}

	public void setDrums(Drums drums) {
		this.drums = drums;
	}

	@Override
	public void perfomans() {
		sax.play();
		guitar.play();
		drums.play();
	}

}
