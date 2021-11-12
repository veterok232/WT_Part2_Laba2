package test.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import main.java.app.entity.Appliance;
import main.java.app.entity.criteria.Criteria;
import main.java.app.entity.criteria.SearchCriteria;
import main.java.app.service.ApplianceService;
import main.java.app.service.ServiceFactory;

import java.util.Comparator;
import java.util.List;

/**
 * Unit test for simple App.
 */

public class AppTest 
    extends TestCase
{
    private ServiceFactory serviceFactory;

    private ApplianceService applianceService;

    private Criteria laptopCriteria;

    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void setUp() {
        serviceFactory = ServiceFactory.getInstance();
        applianceService = serviceFactory.getApplianceService();
        laptopCriteria = new Criteria(SearchCriteria.Laptop.getGroupName());
    }

    public void testGetAllMethod() {
        List<Appliance> result = applianceService.getAll();
        assertNotNull(result);
        assertEquals(21, result.size());
        for (Appliance appliance: result) {
            assertNotNull(appliance);
        }
    }

    public void testFindMethod() {
        List<Appliance> result = applianceService.find(laptopCriteria);

        assertNotNull(result);
        assertEquals(3, result.size());
        for (Appliance appliance: result) {
            assertNotNull(appliance);
        }
    }

    public void testGetByMinPriceMethod() {
        List<Appliance> result = applianceService.getByMinPrice(Comparator.comparing(Appliance::getPrice));

        assertNotNull(result);
        assertEquals(2, result.size());
        for (Appliance appliance: result) {
            assertNotNull(appliance);
        }
    }
}
