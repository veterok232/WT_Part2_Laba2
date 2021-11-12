package main.java.app.dao;

import main.java.app.dao.impl.ApplianceDAOImpl;

/**
 * DAOFanctory class
 */
public final class DAOFactory {
	/**
	 * Instance of DAOFactory
	 */
	private static final DAOFactory instance = new DAOFactory();

	/**
	 * Instance of ApplianceDAO
	 */
	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

	/**
	 * Constructor
	 */
	private DAOFactory() {}

	/**
	 * Get new ApplianceDAO object
	 *
	 * @return ApplianceDAO - new ApplianceDAO object
	 */
	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}

	/**
	 * Get the instance of DAOFactory
	 *
	 * @return DAOFactory
	 */
	public static DAOFactory getInstance() {
		return instance;
	}
}
