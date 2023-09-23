package org.tnsif.heirarchical;

public class Teramisu extends android {
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "AndroidTen [version=" + version + ", toString()=" + super.toString() + "]";
	}

	public Teramisu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teramisu(String brandName, String slotType, int version) {
		super(brandName, slotType);
		// TODO Auto-generated constructor stub
		this.version=version;
	}

//	public AndroidTen() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	

}