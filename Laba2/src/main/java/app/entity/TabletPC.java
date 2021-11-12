package main.java.app.entity;

import java.util.Objects;

/**
 * TabletPC class
 */
public class TabletPC extends Appliance {
    /**
     * Battery capacity
     */
	private double batteryCapacity;

    /**
     * DisplayInches
     */
    private double displayInches;

    /**
     * MemoryRom
     */
    private double memoryRom;

    /**
     * FlashMemoryCapacity
     */
    private double flashMemoryCapacity;

    /**
     * Color
     */
    private String color;

    /**
     * Constructor
     */
    public TabletPC() { }

    /**
     * Constructor
     *
     * @param name - name of TabletPC
     * @param price - price of TabletPC
     * @param batteryCapacity - Battery capacity of TabletPC
     * @param displayInches - Display inches of TablePC
     * @param memoryRom - Memory ROM of TablePC
     * @param flashMemoryCapacity - Flash memory capacity of TablePC
     * @param color - Color of TabletPC
     */
    public TabletPC(
            String name,
            double price,
            double batteryCapacity,
            double displayInches,
            double memoryRom,
            double flashMemoryCapacity,
            String color
    ) {
        super(name, price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    /**
     * Override equals method
     *
     * @param o - object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TabletPC tabletPC = (TabletPC) o;
        return name.equals(tabletPC.name) &&
                price == tabletPC.price &&
                batteryCapacity == tabletPC.batteryCapacity &&
                displayInches == tabletPC.displayInches &&
                color.equals(tabletPC.color) &&
                memoryRom == tabletPC.memoryRom &&
                flashMemoryCapacity == tabletPC.flashMemoryCapacity;
    }

    /**
     * Override hashCode method
     *
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(
                batteryCapacity,
                displayInches,
                memoryRom,
                flashMemoryCapacity,
                color
        );
    }

    /**
     * Override toString method
     *
     * @return String
     */
    @Override
    public String toString() {
        return "TabletPC [" +
                "\n\tname = " + name +
                ",\n\tprice = " + price +
                ",\n\tbatteryCapacity = " + batteryCapacity +
                ",\n\tdisplayInches = " + displayInches +
                ",\n\tmemoryRom = " + memoryRom +
                ",\n\tflashMemoryCapacity = " + flashMemoryCapacity +
                ",\n\tcolor = " + color +
                "\n]\n";
    }

    /**
     * BatteryCapacity getter
     *
     * @return double
     */
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * BatteryCapacity setter
     *
     * @param batteryCapacity - Battery capacity
     */
    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * DisplayInches getter
     *
     * @return double
     */
    public double getDisplayInches() {
        return displayInches;
    }

    /**
     * DisplayInches setter
     *
     * @param displayInches - DisplayInches
     */
    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    /**
     * BatteryCapacity getter
     *
     * @return double
     */
    public double getMemoryRom() {
        return memoryRom;
    }

    /**
     * DisplayInches setter
     *
     * @param memoryRom - MemoryRom
     */
    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    /**
     * FlashMemoryCapacity getter
     *
     * @return double
     */
    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    /**
     * DisplayInches setter
     *
     * @param flashMemoryCapacity - FlashMemoryCapacity
     */
    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    /**
     * Color getter
     *
     * @return double
     */
    public String getColor() {
        return color;
    }

    /**
     * DisplayInches setter
     *
     * @param color - Color
     */
    public void setColor(String color) {
        this.color = color;
    }
}
