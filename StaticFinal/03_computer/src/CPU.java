public class CPU {
    private final int frequency;
    private final int numberOfCores;
    private final String manufacturer;
    private final double weight;

    public CPU(int frequency, int numberOfCores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public CPU setFrequency(int frequency) {
        return new CPU(frequency, numberOfCores, manufacturer, weight);
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public CPU setNumberOfCores(int numberOfCores) {
        return new CPU(frequency, numberOfCores, manufacturer, weight);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public CPU setManufacturer(String manufacturer) {
        return new CPU(frequency, numberOfCores, manufacturer, weight);
    }

    public double getWeight() {
        return weight;
    }

    public CPU setWeight(double weight) {
        return new CPU(frequency, numberOfCores, manufacturer, weight);
    }

    public String toString() {
        return "Процессор:" + "\n" + "* частота - " + getFrequency() + "\n" + "* количество ядер - " +
                getNumberOfCores() + "\n" + "* производитель - " + getManufacturer() + "\n" +
                "* вес - " + getWeight();
    }
}
