package by.tc.task01.entity;

public class Oven extends Appliance {

	private int powerConsumption;
	private int weight;
	private int capacity;
	private int depth;
	private int height;
	private int width;

	public Oven(int powerConsumption, int weight, int capacity, int depth, int height, int width) {
		super();
		setName("Oven");
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
		this.height = height;
		this.width = width;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Name : " + getName() + ", power consumption = " + getPowerConsumption() + ", weight = " + getWeight()
				+ ", capacity = " + getCapacity() + ", depth = " + getDepth() + ", height = " + getHeight()
				+ ", width = " + getWidth();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + capacity;
		result = prime * result + depth;
		result = prime * result + height;
		result = prime * result + powerConsumption;
		result = prime * result + weight;
		result = prime * result + width;
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
		Oven other = (Oven) obj;
		if (capacity != other.capacity)
			return false;
		if (depth != other.depth)
			return false;
		if (height != other.height)
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

}
