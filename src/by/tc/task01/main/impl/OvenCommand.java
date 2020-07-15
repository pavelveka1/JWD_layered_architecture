package by.tc.task01.main.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.main.Command;

public class OvenCommand implements Command {

	@Override
	public String execute(Appliance appliance) {
		Oven oven = (Oven) appliance;
		String ovenInfo = "Name : " + oven.getName() + ", power consumption = " + oven.getPowerConsumption()
				+ ", weight = " + oven.getWeight() + ", capacity = " + oven.getCapacity() + ", depth = "
				+ oven.getDepth() + ", height = " + oven.getHeight() + ", width = " + oven.getWidth();
		return ovenInfo;
	}

}