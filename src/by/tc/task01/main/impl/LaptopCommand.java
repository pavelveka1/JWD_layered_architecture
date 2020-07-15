package by.tc.task01.main.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.main.Command;

public class LaptopCommand implements Command {

	@Override
	public String execute(Appliance appliance) {
		Laptop laptop=(Laptop)appliance;
		String laptopInfo="Name : " + laptop.getName() + ", battery capacity = " + laptop.getBatteryCapacity() + ", OS = "
		+ laptop.getOperationSystem()+ ", memory ROM = " + laptop.getMemoryRom() + ", system memory ="
				+ laptop.getSystemMemory() + ", CPU = "+ laptop.getFrequencyCPU() + ", display inches = " + laptop.getSizeDisplay();
		return laptopInfo;
	}

}
