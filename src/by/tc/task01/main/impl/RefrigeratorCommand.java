package by.tc.task01.main.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.main.Command;

public class RefrigeratorCommand implements Command {

	@Override
	public String execute(Appliance appliance) {
		Refrigerator refrigerator = (Refrigerator) appliance;
		String refrigeratorInfo = "Name : " + refrigerator.getName() + ", power consumption = "
				+ refrigerator.getPowerConsumption() + ", weight = " + refrigerator.getWeight() + ", freezer capacity ="
				+ refrigerator.getFreezerCapacity() + ", overall capacity = " + refrigerator.getOverallCapacity()
				+ ", height = " + refrigerator.getHeight() + ", width = " + refrigerator.getWidth();
		return refrigeratorInfo;
	}

}
