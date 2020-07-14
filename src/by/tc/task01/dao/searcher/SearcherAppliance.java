package by.tc.task01.dao.searcher;

import java.util.Map;
import by.tc.task01.dao.util.LineParser;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class SearcherAppliance {
	private static ApplianceFactory applianceFactory = ApplianceFactory.getInstance();

	public static Appliance searchAppliance(Criteria criteria, String line) {
		Appliance appliance = null;
		String[] params = LineParser.parseLine(line);
		String nameAppliance = line.substring(0, line.indexOf(':'));
		if (checkParams(criteria, line)) {
			appliance = applianceFactory.makeAppliance(nameAppliance, params);
		}
		return appliance;
	}

	private static boolean checkParams(Criteria criteria, String line) {
		Map<String, Object> criteriaParams = criteria.getCriteria();
		for (Map.Entry<String, Object> entry : criteriaParams.entrySet()) {
			if (!line.toUpperCase().contains(entry.getKey().toUpperCase() + "=" + entry.getValue().toString())) {
				return false;
			}
		}
		return true;
	}
}
