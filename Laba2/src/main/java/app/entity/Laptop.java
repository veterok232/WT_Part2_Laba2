package main.java.app.entity;

import java.util.Objects;

/**
 * Laptop class
 */
public class Laptop extends Appliance {
    /**
     * Battery capacity
     */
	private double batteryCapacity;

    /**
     * OS
     */
    private String os;

    /**
     * Memory ROM
     */
    private double memoryRom;

    /**
     * System memory
     */
    private double systemMemory;

    /**
     * CPU
     */
    private double cpu;

    /**
     * Display inches
     */
    private double displayInches;

    /**
     * Constructor
     */
    public Laptop() { }

    /**
     * Constructor
     *
     * @param name - name of laptop
     * @param price - price of laptop
     * @param batteryCapacity - battery capacity
     * @param os - OS
     * @param memoryRom - memory OMm
     * @param systemMemory - System Memory
     * @param cpu - CPU
     * @param displayInches - Display inches
     */
    public Laptop(
            String name,
            double price,
            double batteryCapacity,
            String os,
            double memoryRom,
            double systemMemory,
            double cpu,
            double displayInches
    ) {
        super(name, price);
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    /**
     * Override equals method
     *
     * @param o - laptop object
     *
     * @return boolean - equals result
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Laptop laptop = (Laptop)o;
        return name.equals(laptop.name) &&
                price == laptop.price &&
                batteryCapacity == laptop.batteryCapacity &&
                os.equals(laptop.os) &&
                memoryRom == laptop.memoryRom &&
                systemMemory == laptop.systemMemory &&
                cpu == laptop.cpu  &&
                displayInches == laptop.displayInches;
    }

    /**
     * Override hashCode method
     *
     * @return int - laptop hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(
                batteryCapacity,
                os,
                memoryRom,
                systemMemory,
                cpu,
                displayInches
        );
    }

    /**
     * Override toString method
     *
     * @return String - laptop information
     */
    @Override
    public String toString() {
        return "Laptop [" +
                "\n\tname = " + name +
                ",\n\tprice = " + price +
                ",\n\tbatteryCapacity = " + batteryCapacity +
                ",\n\tos = " + os +
                ",\n\tmemoryRom = " + memoryRom +
                ",\n\tsystemMemory = " + systemMemory +
                ",\n\tCPU = " + cpu +
                ",\n\tdisplayInches = " + displayInches +
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
     * @param batteryCapacity - Battery Capacity
     */
    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * BatteryCapacity getter
     *
     * @return double
     */
    public String getOs() {
        return os;
    }

    /**
     * OS setter
     *
     * @param os - OS
     */
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * MemoryRom getter
     *
     * @return double
     */
    public double getMemoryRom() {
        return memoryRom;
    }

    /**
     * Memory ROM setter
     *
     * @param memoryRom - Memory ROM
     */
    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    /**
     * System memory getter
     *
     * @return double - laptop system memory
     */
    public double getSystemMemory() {
        return systemMemory;
    }

    /**
     * System memory setter
     *
     * @param systemMemory - laptop system memory
     */
    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    /**
     * CPU getter
     *
     * @return double - laptop CPU
     */
    public double getCpu() {
        return cpu;
    }

    /**
     * CPU setter
     *
     * @param cpu - laptop CPU
     */
    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    /**
     * Display inches getter
     *
     * @return double - laptop display inches
     */
    public double getDisplayInches() {
        return displayInches;
    }

    /**
     * Display inches setter
     *
     * @param displayInches - laptop display inches
     */
    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }
}
