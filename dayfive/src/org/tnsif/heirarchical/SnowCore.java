package org.tnsif.heirarchical;

public class SnowCore extends android {
	
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}

	

	public SnowCore(String brandName, String slotType,int version) {
		super(brandName, slotType);
		// TODO Auto-generated constructor stub
		this.version=version;
	}
	
	
	
	

}
