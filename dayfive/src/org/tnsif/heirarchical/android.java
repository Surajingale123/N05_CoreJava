package org.tnsif.heirarchical;

public class android {
	private String brandName;
	private String slotType;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	public android() {
		super();
	}
	public android(String brandName, String slotType) {
		super();
		this.brandName = brandName;
		this.slotType = slotType;
	}
	@Override
	public String toString() {
		return "Android [brandName=" + brandName + ", slotType=" + slotType + "]";
	}
	

}
