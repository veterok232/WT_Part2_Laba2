package main.java.app.entity.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * Criteria class
 */
public class Criteria {
	/**
	 * Group name
	 */
	private String groupSearchName;

	/**
	 * Criteria
	 */
	private Map<String, Object> criteria = new HashMap<String, Object>();

	/**
	 * Constructor
	 *
	 * @param groupSearchName - name of the group
	 */
	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	/**
	 * Group name getter
	 *
	 * @return String - group name
	 */
	public String getGroupSearchName() {
		return groupSearchName;
	}

	/**
	 * Criteria getter
	 *
	 * @return criteria
	 */
	public Map<String, Object> getCriteria() {
		return criteria;
	}

	/**
	 * Add new criteria
	 *
	 * @param searchCriteria - criteria
	 * @param value - value
	 */
	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
}
