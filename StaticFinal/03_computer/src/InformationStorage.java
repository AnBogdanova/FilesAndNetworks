enum InformationStorageType {
    HDD, SSD
}

public class InformationStorage {
    private final InformationStorageType type; //- HDD, SSD,
    private final int memoryVolume;
    private final double weight;

    public InformationStorage(InformationStorageType type, int memoryVolume, double weight) {
        this.type = type;
        this.memoryVolume = memoryVolume;
        this.weight = weight;
    }

    public InformationStorageType getType() {
        return type;
    }

    public InformationStorage setType(InformationStorageType type) {
        return new InformationStorage(type, memoryVolume, weight);
    }

    public int getMemoryVolume() {
        return memoryVolume;
    }

    public InformationStorage setMemoryVolume(int memoryVolume) {
        return new InformationStorage(type, memoryVolume, weight);
    }

    public double getWeight() {
        return weight;
    }

    public InformationStorage setWeight(double weight) {
        return new InformationStorage(type, memoryVolume, weight);
    }

    public String toString() {
        return "Накопитель информации:" + "\n" + "* тип - " + getType() + "\n" + "* объём памяти - " +
                getMemoryVolume() + "\n" + "* вес - " + getWeight();
    }


}
