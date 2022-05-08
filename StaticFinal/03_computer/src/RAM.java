public class RAM {
    private final String type;
    private final int volume;
    private final double weight;

    public RAM(String type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public RAM setType(String type) {
        return new RAM(type, volume, weight);
    }

    public int getVolume() {
        return volume;
    }

    public RAM setVolume(int volume) {
        return new RAM(type, volume, weight);
    }

    public double getWeight() {
        return weight;
    }

    public RAM setWeight(double weight) {
        return new RAM(type, volume, weight);
    }

    public String toString() {
        return "Оперативная память:" + "\n" + "* тип - " + getType() + "\n" + "* объём - " +
                getVolume() + "\n" + "* вес - " + getWeight();
    }
}
