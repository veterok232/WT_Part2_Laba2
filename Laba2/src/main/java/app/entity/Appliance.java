package main.java.app.entity;

/**
 * Appliance class
 */
public class Appliance {
    /**
     * Name of appliance
     */
	protected String name;

    /**
     * Price of appliance
     */
    protected double price;

    /**
     * Constructor
     */
    public Appliance() { }

    /**
     * Constructor
     *
     * @param name - name of appliance
     * @param price - price of appliance
     */
    protected Appliance(String name, double price) {
        this.name = name;
        this.price = price;
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
     * Name setter
     *
     * @param name - name of appliance
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Price getter
     *
     * @return double
     */
    public double getPrice() {
        return price;
    }

    /**
     * Price setter
     *
     * @param price - price of appliance
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
