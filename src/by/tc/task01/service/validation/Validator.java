package by.tc.task01.service.validation;

import java.util.Map;
import by.tc.task01.entity.criteria.Criteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {
		Map<String, Object> paramsCriteria = criteria.getCriteria();
		for (Map.Entry<String, Object> entry : paramsCriteria.entrySet()) {
			if (entry.getValue() == null) {
				return false;
			} else {
				if (entry.getValue() instanceof Number) {
					double numberValue = Double.parseDouble(entry.getValue().toString());
					if (numberValue < 0) {
						return false;
					}
				}
			}
		}
		return true;
	}

}

//you may add your own new classes