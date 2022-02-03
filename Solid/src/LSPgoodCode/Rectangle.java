package LSPgoodCode;

public class Rectangle implements Squire {

	int wight;
	int hight;

	public void setWight(int wight) {

		this.wight = wight;

	}

	public void setHeight(int hight) {

		this.hight = hight;

	}

	@Override
	public int calculateSquire() {

		return wight * hight;
	}

}
