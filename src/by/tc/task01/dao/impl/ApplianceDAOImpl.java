package by.tc.task01.dao.impl;

import java.util.ArrayList;
import java.util.List;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.ApplianceReader;
import by.tc.task01.dao.exception.DAOException;
import by.tc.task01.dao.reader.ApplianceFileReader;
import by.tc.task01.dao.searcher.SearcherAppliance;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException {
		List<Appliance> appliances = new ArrayList<Appliance>();
		Appliance appliance = null;
		ApplianceReader applianceReader = new ApplianceFileReader();
		String line = applianceReader.readLine();

		while (line != null && !line.isEmpty()) {
			appliance = SearcherAppliance.searchAppliance(criteria, line);
			if (appliance != null) {
				appliances.add(appliance);
			}
			line = applianceReader.readLine();
		}
		return appliances;
	}
}
