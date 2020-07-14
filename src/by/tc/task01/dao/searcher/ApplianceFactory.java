package by.tc.task01.dao.searcher;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public class ApplianceFactory {
	private static final ApplianceFactory instance = new ApplianceFactory();

	private ApplianceFactory() {
	}

	public static ApplianceFactory getInstance() {
		return instance;
	}

	public Appliance makeAppliance(String nameAppliance, String[] params) {
		Appliance appliance = null;
		switch (nameAppliance.trim().toLowerCase()) {
		case "oven":
			appliance = new Oven(Integer.parseInt(params[0]), Integer.parseInt(params[1]), Integer.parseInt(params[2]),
					Integer.parseInt(params[3]), Integer.parseInt(params[4]), Integer.parseInt(params[5]));
			break;
		case "laptop":
			appliance = new Laptop(Double.parseDouble(params[0]), params[1], Integer.parseInt(params[2]),
					Integer.parseInt(params[3]), Double.parseDouble(params[4]), Integer.parseInt(params[5]));
			break;
		case "refrigerator":
			appliance = new Refrigerator(Integer.parseInt(params[0]), Integer.parseInt(params[1]),
					Integer.parseInt(params[2]), Integer.parseInt(params[3]), Integer.parseInt(params[4]),
					Integer.parseInt(params[5]));
			break;
		case "vacuumcleaner":
			appliance = new VacuumCleaner(Integer.parseInt(params[0]), params[1], params[2], params[3],
					Integer.parseInt(params[4]), Integer.parseInt(params[5]));
			break;
		case "tabletpc":
			appliance = new TabletPC(Double.parseDouble(params[0]), Integer.parseInt(params[1]),
					Integer.parseInt(params[2]), Integer.parseInt(params[3]), params[4]);
			break;
		case "Speakers":
			appliance = new Speakers(Integer.parseInt(params[0]), Integer.parseInt(params[1]), params[2],
					Integer.parseInt(params[3]));
			break;
		}
		return appliance;
	}

}
