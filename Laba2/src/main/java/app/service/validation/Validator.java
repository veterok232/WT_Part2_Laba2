package main.java.app.service.validation;

import main.java.app.entity.criteria.ApplianceCriteria;
import main.java.app.entity.criteria.Criteria;
import main.java.app.entity.criteria.SearchCriteria;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/**
 * Validator class
 */
public class Validator {
	/**
	 * Criteria validator
	 *
	 * @param criteria - criteria
	 * @return boolean
	 */
	public static boolean criteriaValidator(Criteria criteria) {
		switch (criteria.getGroupSearchName()) {
			case "Oven":
				return checkCriteriaExisting(criteria, SearchCriteria.Oven.values());
			case "Laptop":
				return checkCriteriaExisting(criteria, SearchCriteria.Laptop.values());
			case "Refrigerator":
				return checkCriteriaExisting(criteria, SearchCriteria.Refrigerator.values());
			case "VacuumCleaner":
				return checkCriteriaExisting(criteria, SearchCriteria.VacuumCleaner.values());
			case "Kettle":
				return checkCriteriaExisting(criteria, SearchCriteria.Kettle.values());
			default : return false;
		}
	}

	/**
	 * Check criteria for existing
	 *
	 * @param criteria - criteria
	 * @param existingCriteria - array of existing criterias
	 * @return boolean
	 */
	private static boolean checkCriteriaExisting(Criteria criteria, ApplianceCriteria[] existingCriteria) {
		Set<String> properties = criteria.getCriteria().keySet();

		return properties.stream().allMatch(
				p -> Arrays.stream(existingCriteria).anyMatch(e -> Objects.equals(e.getName(), p))
		);
	}
}
