package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.service.exception.ServiceException;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliances = null;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.CAPACITY.toString(), 33);

		try {
			appliances = service.find(criteriaOven);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		PrintListApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 200);
		criteriaOven.add(Oven.DEPTH.toString(), 300);

		try {
			appliances = service.find(criteriaOven);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PrintListApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

		try {
			appliances = service.find(criteriaTabletPC);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // find(Object...obj)

		PrintListApplianceInfo.print(appliances);

	}

}
