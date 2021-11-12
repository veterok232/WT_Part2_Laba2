package main.java.app.main;

import main.java.app.entity.Appliance;
import main.java.app.entity.criteria.Criteria;
import main.java.app.entity.criteria.SearchCriteria;
import main.java.app.service.ApplianceService;
import main.java.app.service.ServiceFactory;

import java.util.Comparator;

/**
 * Main class
 */
public class Main {

	/**
	 * Main method
	 *
	 * @param args - arguments of command line
	 */
	public static void main(String[] args) {
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ApplianceService applianceService = serviceFactory.getApplianceService();
		Criteria kettleCriteria = new Criteria(SearchCriteria.Kettle.getGroupName());

		System.out.println("All appliances:");
		PrintApplianceInfo.print(applianceService.getAll());

		System.out.println("All kettles:");
		PrintApplianceInfo.print(applianceService.find(kettleCriteria));

		System.out.println("Appliances with minimal price:");
		PrintApplianceInfo.print(applianceService.getByMinPrice(Comparator.comparing(Appliance::getPrice)));
	}

}
