package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public interface Command {
	public String execute(Appliance appliance);
}
