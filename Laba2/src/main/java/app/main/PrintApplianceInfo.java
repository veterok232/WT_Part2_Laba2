package main.java.app.main;

import main.java.app.entity.Appliance;

import java.util.List;

/**
 * PrintApplianceInfo class
 */
public class PrintApplianceInfo {
	/**
	 * Print applince info
	 *
	 * @param appliances - list of appliances
	 */
	public static void print(List<Appliance> appliances) {
		for (Appliance appliance : appliances) {
			System.out.println(appliance);
		}
	}
}
