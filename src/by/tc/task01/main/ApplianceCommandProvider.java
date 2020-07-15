package by.tc.task01.main;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.main.impl.LaptopCommand;
import by.tc.task01.main.impl.OvenCommand;
import by.tc.task01.main.impl.RefrigeratorCommand;
import by.tc.task01.main.impl.SpeakersCommand;
import by.tc.task01.main.impl.TabletPCCommand;
import by.tc.task01.main.impl.VacuumCleanerCommand;

public class ApplianceCommandProvider {
	private final Map<String, Command> repository = new HashMap<>();

	public ApplianceCommandProvider() {
		repository.put("Laptop", new LaptopCommand());
		repository.put("Oven", new OvenCommand());
		repository.put("Refrigerator", new RefrigeratorCommand());
		repository.put("Speakers", new SpeakersCommand());
		repository.put("TabletPC", new TabletPCCommand());
		repository.put("Vacuum cleaner", new VacuumCleanerCommand());
	}

	Command getCommand(String name) {
		String commandName = name;
		Command command = null;
		try {

			command = repository.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {
			// write log
			e.printStackTrace();
		}
		return command;
	}

}
