package delegation;

public class SpaceSchip {

	private String schipName;

//	private 
	SpaceSchipControls spaceSchipControls  = new SpaceSchipControls();

	public SpaceSchip(String schipName) {
		super();
		this.schipName = schipName;
	}

	public void up() {

		spaceSchipControls.movieUP(20);

	}

	public void down() {
		spaceSchipControls.movieDOWN(210);
	}

	public void left() {
		spaceSchipControls.movieLEFT(500);
	}

	public void right() {
		spaceSchipControls.movieRIGHT(900);
	}

	public String getSchipName() {
		return schipName;
	}

	public void setSchipName(String schipName) {
		this.schipName = schipName;
	}

	public SpaceSchipControls getSpaceSchipControls() {
		return spaceSchipControls;
	}

	public void setSpaceSchipControls(SpaceSchipControls spaceSchipControls) {
		this.spaceSchipControls = spaceSchipControls;
	}

	@Override
	public String toString() {
		return "SpaceSchip [schipName=" + schipName + ", spaceSchipControls=" + spaceSchipControls + "]";
	}

}
