package main.java.app.dao.impl;

import main.java.app.dao.ApplianceDAO;
import main.java.app.entity.Appliance;
import main.java.app.entity.criteria.Criteria;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * ApplianceDAOImpl class
 */
public class ApplianceDAOImpl implements ApplianceDAO{
	/**
	 * Path to appliances_db.xml
	 */
	private static final String PATH_TO_APPLIANCES = "src/main/resources/appliances_db.xml";

	/**
	 * Get all appliances from .xml
	 *
	 * @return list of appliances
	 */
	@Override
	public List<Appliance> getAll() {
		ArrayList<Appliance> appliances = new ArrayList<>();
		Appliance appliance;

		try (XMLDecoder decoder = new XMLDecoder(
				new BufferedInputStream(new FileInputStream(ApplianceDAOImpl.PATH_TO_APPLIANCES)))
		) {
			do {
				appliance = (Appliance) decoder.readObject();
				appliances.add(appliance);
			} while (appliance != null);
		}
		catch (ArrayIndexOutOfBoundsException e) { }
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return appliances;
	}

	/**
	 * Find all appliamces by criteria
	 *
	 * @param criteria - criteria for searching
	 * @return list of found appliances
	 */
	@Override
	public List<Appliance> find(Criteria criteria) {
		ArrayList<Appliance> appliances = new ArrayList<>();
		Appliance appliance;

		try (XMLDecoder decoder = new XMLDecoder(
				new BufferedInputStream(new FileInputStream(ApplianceDAOImpl.PATH_TO_APPLIANCES)))
		) {
			do {
				appliance = (Appliance)decoder.readObject();

				if (this.hasProperties(appliance, criteria)) {
					appliances.add(appliance);
				}
			} while (appliance != null);
		}
		catch (ArrayIndexOutOfBoundsException e) { }
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return appliances;
	}

	/**
	 * Save appliances to .xml
	 *
	 * @param appliances - list of appliances to save in .xml
	 */
	@Override
	public void save(List<Appliance> appliances) {
		try (XMLEncoder encoder = new XMLEncoder(
				new BufferedOutputStream(new FileOutputStream(ApplianceDAOImpl.PATH_TO_APPLIANCES)))
		) {
			for (Appliance appliance: appliances) {
				encoder.writeObject(appliance);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) { }
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Check if appliance match the criteria
	 *
	 * @param appliance - appliance to check
	 * @param criteria - criteria of check
	 * @return boolean
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	private boolean hasProperties(Appliance appliance, Criteria criteria)
			throws NoSuchFieldException,IllegalAccessException{
		if (!criteria.getGroupSearchName().equals(appliance.getClass().getSimpleName())) {
			return false;
		}

		// Find necessary property
		Set<String> properties = criteria.getCriteria().keySet();
		for (String prop : properties) {
			Object fieldValue;
			Field field = appliance.getClass().getDeclaredField(prop);
			field.setAccessible(true);
			fieldValue = field.get(appliance);

			if (!fieldValue.equals(criteria.getCriteria().get(prop))) {
				return false;
			}
		}

		return true;
	}
}
