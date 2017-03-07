package players;

public class Bob implements Instrumentalist {
    private Instrument instrument; 
    
    public Bob(Instrument instrument) {
		super();
		this.instrument = instrument;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perfomans() {
		instrument.play();
		
	}

}
