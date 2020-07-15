package by.tc.task01.main.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.main.Command;

public class TabletPCCommand implements Command {

	@Override
	public String execute(Appliance appliance) {
		TabletPC tablet = (TabletPC) appliance;
		String tabletInfo = "Name :" + tablet.getName() + ", battery capacity = " + tablet.getBatteryCapacity()
				+ ", flafh memory capacity = " + tablet.getFlashMemory() + ", memory ROM = " + tablet.getMemoryRom()
				+ ", display inches = " + tablet.getSizeDisplay() + ", color = " + tablet.getColor();
		return tabletInfo;

	}

}
