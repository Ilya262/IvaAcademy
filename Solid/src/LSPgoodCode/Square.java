package LSPgoodCode;

public class Square implements Squire {

	int wight;

	public void setWight(int wight ) {
		this.wight=wight;
	}

	@Override
	public int calculateSquire() {

		return wight * wight;
	}

}
