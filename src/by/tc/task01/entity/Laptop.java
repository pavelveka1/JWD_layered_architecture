package by.tc.task01.entity;

public class Laptop extends Appliance {
	private double batteryCapacity;
	private String operationSystem;
	private int memoryRom;
	private int systemMemory;
	private double frequencyCPU;
	private int sizeDisplay;

	public Laptop(double batteryCapacity, String operationSystem, int memoryRom, int systemMemory, double frequencyCPU,
			int sizeDisplay) {
		super();
		setName("Laptop");
		this.batteryCapacity = batteryCapacity;
		this.operationSystem = operationSystem;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.frequencyCPU = frequencyCPU;
		this.sizeDisplay = sizeDisplay;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBattetyCapacity(double battetyCapacity) {
		this.batteryCapacity = battetyCapacity;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoeyRom) {
		this.memoryRom = memoeyRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getFrequencyCPU() {
		return frequencyCPU;
	}

	public void setFrequencyCPU(double frequencyCPU) {
		this.frequencyCPU = frequencyCPU;
	}

	public int getSizeDisplay() {
		return sizeDisplay;
	}

	public void setSizeDisplay(int sizeDisplay) {
		this.sizeDisplay = sizeDisplay;
	}

	@Override
	public String toString() {
		return "Name : " + getName() + ", battery capacity = " + getBatteryCapacity() + ", OS = " + getOperationSystem()
				+ ", memory ROM = " + getMemoryRom() + ", system memory =" + getSystemMemory() + ", CPU = "
				+ getFrequencyCPU() + ", display inches = " + getSizeDisplay();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(batteryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(frequencyCPU);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + memoryRom;
		result = prime * result + ((operationSystem == null) ? 0 : operationSystem.hashCode());
		result = prime * result + sizeDisplay;
		result = prime * result + systemMemory;
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
		Laptop other = (Laptop) obj;
		if (Double.doubleToLongBits(batteryCapacity) != Double.doubleToLongBits(other.batteryCapacity))
			return false;
		if (Double.doubleToLongBits(frequencyCPU) != Double.doubleToLongBits(other.frequencyCPU))
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		if (operationSystem == null) {
			if (other.operationSystem != null)
				return false;
		} else if (!operationSystem.equals(other.operationSystem))
			return false;
		if (sizeDisplay != other.sizeDisplay)
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}

}
