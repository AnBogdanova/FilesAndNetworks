public class Keyboard {
    private final String type;
    private final boolean presenceOfIllumination;
    private final double weight;

    public Keyboard(String type, boolean presenceOfIllumination, double weight) {
        this.type = type;
        this.presenceOfIllumination = presenceOfIllumination;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public Keyboard setType(String type) {
        return new Keyboard(type, presenceOfIllumination, weight);
    }

    public boolean isPresenceOfIllumination() {
        return presenceOfIllumination;
    }

    public Keyboard setPresenceOfIllumination(boolean presenceOfIllumination) {
        return new Keyboard(type, presenceOfIllumination, weight);
    }

    public double getWeight() {
        return weight;
    }

    public Keyboard setWeight(int weight) {
        return new Keyboard(type, presenceOfIllumination, weight);
    }

    public String toString() {
        return "Клавиатура:" + "\n" + "* тип - " + getType() + "\n" + "* наличие подсветки - " +
                isPresenceOfIllumination() + "\n" + "* вес - " + getWeight();
    }
}
