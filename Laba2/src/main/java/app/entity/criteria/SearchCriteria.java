package main.java.app.entity.criteria;

/**
 * SearchCriteria static class
 */
public final class SearchCriteria {

	/**
	 * Oven enum
	 */
	public enum Oven implements ApplianceCriteria {
		POWER_CONSUMPTION("powerConsumption"),
		WEIGHT("weight"),
		CAPACITY("capacity"),
		DEPTH("depth"),
		HEIGHT("heigth"),
		WIDTH("width");

		/**
		 * Oven name
		 */
		private final String name;

		/**
		 * Constructor
		 *
		 * @param name - name of an oven
		 */
		Oven(String name) {
			this.name = name;
		}

		/**
		 * Name getter
		 *
		 * @return String
		 */
		public String getName() {
			return name;
		}

		/**
		 * Group name getter
		 *
		 * @return String
		 */
		public static String getGroupName() {
			return "Oven";
		}
	}

	/**
	 * Laptop enum
	 */
	public enum Laptop implements ApplianceCriteria {
		BATTERY_CAPACITY("batteryCapacity"),
		OS("os"),
		MEMORY_ROM("memoryRom"),
		SYSTEM_MEMORY("systemMemory"),
		CPU("cpu"),
		DISPLAY_INCHES("displayInches");

		/**
		 * Name of a laptop
		 */
		private final String name;

		/**
		 * Constructor
		 *
		 * @param name - name of a laptop
		 */
		Laptop(String name) {
			this.name = name;
		}

		/**
		 * Name getter
		 *
		 * @return String
		 */
		public String getName() {
			return name;
		}

		/**
		 * Group name getter
		 *
		 * @return String
		 */
		public static String getGroupName() {
			return "Laptop";
		}
	}

	/**
	 * Refrigerator enum
	 */
	public enum Refrigerator implements ApplianceCriteria {
		POWER_CONSUMPTION("powerConsumption"),
		WEIGHT("weight"),
		FREEZER_CAPACITY("freezerCapacity"),
		OVERALL_CAPACITY("overallCapacity"),
		HEIGHT("height"),
		WIDTH("width");

		/**
		 * Name of refrigerator
		 */
		private final String name;

		/**
		 * Constructor
		 *
		 * @param name - name of refrigerator
		 */
		Refrigerator(String name) {
			this.name = name;
		}

		/**
		 * Name getter
		 *
		 * @return String
		 */
		public String getName() {
			return name;
		}

		/**
		 * Group name getter
		 *
		 * @return String
		 */
		public static String getGroupName() {
			return "Refrigerator";
		}
	}

	/**
	 * VacuumCleaner enum
	 */
	public enum VacuumCleaner implements ApplianceCriteria {
		POWER_CONSUMPTION("powerConsumption"),
		FILTER_TYPE("filterType"),
		BAG_TYPE("bagType"),
		WAND_TYPE("wandType"),
		MOTOR_SPEED_REGULATION("motorSpeedRegulation"),
		CLEANING_WIDTH("cleaningWidth");

		/**
		 * Name of VacuumCleaner
		 */
		private final String name;

		/**
		 * Constructor
		 *
		 * @param name - name of VacuumCleaner
		 */
		VacuumCleaner(String name) {
			this.name = name;
		}

		/**
		 * Name getter
		 *
		 * @return String
		 */
		public String getName() {
			return name;
		}

		/**
		 * Group name getter
		 *
		 * @return String
		 */
		public static String getGroupName() {
			return "VacuumCleaner";
		}
	}

	/**
	 * TabletPC enum
	 */
	public enum TabletPC implements ApplianceCriteria {
		BATTERY_CAPACITY("batteryCapacity"),
		DISPLAY_INCHES("displayInches"),
		MEMORY_ROM("memoryRom"),
		FLASH_MEMORY_CAPACITY("flashMemoryCapacity"),
		COLOR("color");

		/**
		 * Name of TabletPC
		 */
		private final String name;

		/**
		 * Constructor
		 *
		 * @param name - name of TabletPC
		 */
		TabletPC(String name) {
			this.name = name;
		}

		/**
		 * Name getter
		 *
		 * @return String
		 */
		public String getName() {
			return name;
		}

		/**
		 * Group name getter
		 *
		 * @return String
		 */
		public static String getGroupName() {
			return "TabletPC";
		}
	}

	/**
	 * Speakers enum
	 */
	public enum Speakers implements ApplianceCriteria {
		POWER_CONSUMPTION("powerConsumption"),
		NUMBER_OF_SPEAKERS("numberOfSpeakers"),
		FREQUENCY_RANGE("frequencyRange"),
		CORD_LENGTH("cordLength");

		/**
		 * Name of speakers
		 */
		private final String name;

		/**
		 * Constructor
		 *
		 * @param name - name of speakers
		 */
		Speakers(String name) {
			this.name = name;
		}

		/**
		 * Name getter
		 *
		 * @return String
		 */
		public String getName() {
			return name;
		}

		/**
		 * Group name getter
		 *
		 * @return String
		 */
		public static String getGroupName() {
			return "Speakers";
		}
	}

	/**
	 * Kettle enum
	 */
	public enum Kettle implements ApplianceCriteria {
		POWER_CONSUMPTION("powerConsumption"),
		CAPACITY("capacity"),
		HEIGHT("height");

		/**
		 * Name of kettle
		 */
		private final String name;

		/**
		 * Constructor
		 *
		 * @param name - name of kettle
		 */
		Kettle(String name) {
			this.name = name;
		}

		/**
		 * Name getter
		 *
		 * @return String
		 */
		public String getName() {
			return name;
		}

		/**
		 * Group name getter
		 *
		 * @return String
		 */
		public static String getGroupName() {
			return "Kettle";
		}
	}

	/**
	 * Constructor
	 */
	private SearchCriteria() { }
}

