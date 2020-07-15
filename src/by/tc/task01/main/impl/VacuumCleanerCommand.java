package by.tc.task01.main.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.main.Command;

public class VacuumCleanerCommand implements Command {

	@Override
	public String execute(Appliance appliance) {
		VacuumCleaner cleaner = (VacuumCleaner) appliance;
		String cleanerInfo = "Name : " + cleaner.getName() + ", power consumption = " + cleaner.getPowerConsumption()
				+ ", filter type = " + cleaner.getFilterType() + ", bag type = " + cleaner.getBagType()
				+ ", wand type = " + cleaner.getWandType() + ", motor speed = " + cleaner.getMotorSpeed()
				+ ", cleaning width = " + cleaner.getCleaningWidth();
		return cleanerInfo;

	}

}
