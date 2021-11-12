package main.java.app.service;

import main.java.app.service.impl.ApplianceServiceImpl;

/**
 * ServiceFactory class
 */
public final class ServiceFactory {
	/**
	 * Instance of ServiceFactory
	 */
	private static final ServiceFactory instance = new ServiceFactory();

	/**
	 * Instance of ApplianceService
	 */
	private final ApplianceService applianceService = new ApplianceServiceImpl();

	/**
	 * Constructor
	 */
	private ServiceFactory() {}

	/**
	 * Get a new instance of ApplianceService
	 *
	 * @return ApplianceService
	 */
	public ApplianceService getApplianceService() {

		return applianceService;
	}

	/**
	 * Get the instance of ServiceFactory
	 *
	 * @return ServiceFactory
	 */
	public static ServiceFactory getInstance() {
		return instance;
	}

}
