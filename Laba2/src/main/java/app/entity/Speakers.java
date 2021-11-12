package main.java.app.entity;

import java.util.Objects;

/**
 * Speakers class
 */
public class Speakers extends Appliance {
    /**
     * Power consumption
     */
	private double powerConsumption;

    /**
     * Number of speakers
     */
    private double numberOfSpeakers;

    /**
     * Frequency range
     */
    private String frequencyRange;

    /**
     * Cord length
     */
    private double cordLength;

    /**
     * Constructor
     */
    public Speakers() { }

    /**
     * Constructor
     *
     * @param name - name of speakers
     * @param price - price of speakers
     * @param powerConsumption - power consumtion of speakers
     * @param numberOfSpeakers - number of speakers
     * @param frequencyRange - frequncy range of speakers
     * @param cordLength - cord length of speakers
     */
    public Speakers(
            String name,
            double price,
            double powerConsumption,
            double numberOfSpeakers,
            String frequencyRange,
            double cordLength
    ) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    /**
     * Override equals method
     *
     * @param o - Speakers object
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

        Speakers speakers = (Speakers) o;
        return name.equals(speakers.name) &&
                price == speakers.price &&
                powerConsumption == speakers.powerConsumption &&
                numberOfSpeakers == speakers.numberOfSpeakers &&
                frequencyRange.equals(speakers.frequencyRange) &&
                cordLength == speakers.cordLength;
    }

    /**
     * Override hashCode method
     *
     * @return int - speakers hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(
                powerConsumption,
                numberOfSpeakers,
                frequencyRange,
                cordLength
        );
    }

    /**
     * Override toString method
     *
     * @return String - speakers information
     */
    @Override
    public String toString() {
        return "Speakers [" +
                "\n\tname = " + name +
                ",\n\tprice = " + price +
                ",\n\tpowerConsumption = " + powerConsumption +
                ",\n\tnumberOfSpeakers = " + numberOfSpeakers +
                ",\n\tfrequencyRange = " + frequencyRange +
                ",\n\tcordLength = " + cordLength +
                "\n]\n";
    }

    /**
     * PowerConsumption getter
     *
     * @return double
     */
    public double getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * PowerConsumption setter
     *
     * @param powerConsumption - PowerConsumption
     */
    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    /**
     * NumberOfSpeakers getter
     *
     * @return double
     */
    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    /**
     * NumberOfSpeakers setter
     *
     * @param numberOfSpeakers - NumberOfSpeakers
     */
    public void setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    /**
     * FrequencyRange getter
     *
     * @return String
     */
    public String getFrequencyRange() {
        return frequencyRange;
    }

    /**
     * FrequencyRange setter
     *
     * @param frequencyRange - FrequencyRange
     */
    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    /**
     * CordLength getter
     *
     * @return double
     */
    public double getCordLength() {
        return cordLength;
    }

    /**
     * CordLength setter
     *
     * @param cordLength - CordLength
     */
    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }
}
