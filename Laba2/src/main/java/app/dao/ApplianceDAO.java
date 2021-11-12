package main.java.app.dao;

import main.java.app.entity.Appliance;
import main.java.app.entity.criteria.Criteria;

import java.util.List;

/**
 * ApplianceDAO interface
 */
public interface ApplianceDAO {
	/**
	 * Get all appliances from .xml
	 *
	 * @return list of appliances
	 */
	List<Appliance> getAll();

	/**
	 * Find all appliamces by criteria
	 *
	 * @param criteria - criteria for searching
	 * @return list of found appliances
	 */
	List<Appliance> find(Criteria criteria);

	/**
	 * Save appliances to .xml
	 *
	 * @param appliances - list of appliances to save in .xml
	 */
	void save(List<Appliance> appliances);
}
