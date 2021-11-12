package main.java.app.service.impl;

import main.java.app.dao.ApplianceDAO;
import main.java.app.dao.DAOFactory;
import main.java.app.entity.Appliance;
import main.java.app.entity.criteria.Criteria;
import main.java.app.service.ApplianceService;
import main.java.app.service.validation.Validator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * ApplianceServiceImpl class
 */
public class ApplianceServiceImpl implements ApplianceService{
	/**
	 * Get all appliances
	 *
	 * @return list of appliances
	 */
	@Override
	public List<Appliance> getAll() {
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		return applianceDAO.getAll();
	}

	/**
	 * Find appliand by criteria
	 *
	 * @param criteria - criteria
	 * @return list of found appliances
	 */
	@Override
	public List<Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		return applianceDAO.find(criteria);
	}

	/**
	 * Get appliances with minimum price
	 *
	 * @param comparator - comparator
	 * @return list of found appliances
	 */
	@Override
	public List<Appliance> getByMinPrice(Comparator<Appliance> comparator) {
		DAOFactory factory = DAOFactory.getInstance();
		List<Appliance> appliances = factory.getApplianceDAO().getAll();

		// Get list of prices and fin min value
		Optional<Appliance> minPrices = appliances.stream().min(comparator);
		Appliance minPrice = minPrices.orElse(null);
		if (minPrice != null) {
			return appliances.stream().filter(
					p -> comparator.compare(p, minPrice) == 0).collect(Collectors.toList()
			);
		}

		return new ArrayList<>();
	}

	/**
	 * Save appliances
	 *
	 * @param appliances - appliances to save
	 */
	@Override
	public void save(List<Appliance> appliances) {
		DAOFactory factory = DAOFactory.getInstance();
		factory.getApplianceDAO().save(appliances);
	}
}
