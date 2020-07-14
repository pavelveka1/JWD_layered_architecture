package by.tc.task01.entity;

public class TabletPC extends Appliance {

	private double batteryCapacity;
	private int memoryRom;
	private int sizeDisplay;
	private int flashMemory;
	private String color;

	public TabletPC(double batteryCapacity, int sizeDisplay, int memoryRom, int flashMemory, String color) {
		super();
		setName("TabletPC");
		this.batteryCapacity = batteryCapacity;
		this.memoryRom = memoryRom;
		this.sizeDisplay = sizeDisplay;
		this.flashMemory = flashMemory;
		this.color = color;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getSizeDisplay() {
		return sizeDisplay;
	}

	public void setSizeDisplay(int sizeDisplay) {
		this.sizeDisplay = sizeDisplay;
	}

	public int getFlashMemory() {
		return flashMemory;
	}

	public void setFlashMemory(int flashMemory) {
		this.flashMemory = flashMemory;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Name :" + getName() + ", battery capacity = " + getBatteryCapacity() + ", flafh memory capacity = "
				+ getFlashMemory() + ", memory ROM = " + getMemoryRom() + ", display inches = " + getSizeDisplay()
				+ ", color = " + getColor();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(batteryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + flashMemory;
		result = prime * result + memoryRom;
		result = prime * result + sizeDisplay;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TabletPC other = (TabletPC) obj;
		if (Double.doubleToLongBits(batteryCapacity) != Double.doubleToLongBits(other.batteryCapacity))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (flashMemory != other.flashMemory)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		if (sizeDisplay != other.sizeDisplay)
			return false;
		return true;
	}

}
