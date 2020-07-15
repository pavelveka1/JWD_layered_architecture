package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintListApplianceInfo {

	private final static ApplianceCommandProvider provider=new ApplianceCommandProvider();
	private static Command applianceCommand=null;
	public static void print(List<Appliance> appliances) {
		
		for (Appliance appliance : appliances) {
			String nameAppliance=appliance.getName();
			applianceCommand=provider.getCommand(nameAppliance);
			System.out.println(applianceCommand.execute(appliance));
		}

	}

	// you may add your own code here

}
