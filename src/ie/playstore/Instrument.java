package ie.playstore;

public abstract class Instrument implements Playable {
	
	@Override
	public void setName(String s) {
		this.setName(s);
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public abstract void play();

}
