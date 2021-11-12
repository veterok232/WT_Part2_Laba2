package main.java.app.service;

import main.java.app.entity.Appliance;
import main.java.app.entity.criteria.Criteria;

import java.util.Comparator;
import java.util.List;

/**
 * ApplianceService interface
 */
public interface ApplianceService {
	/**
	 * Get all appliances
	 *
	 * @return list of appliances
	 */
	List<Appliance> getAll();

	/**
	 * Find appliand by criteria
	 *
	 * @param criteria - criteria
	 * @return list of found appliances
	 */
	List<Appliance> find(Criteria criteria);

	/**
	 * Get appliances with minimum price
	 *
	 * @param comparator - comparator
	 * @return list of found appliances
	 */
	List<Appliance> getByMinPrice(Comparator<Appliance> comparator);

	/**
	 * Save appliances
	 *
	 * @param appliances - appliances to save
	 */
	void save(List<Appliance> appliances);
}
