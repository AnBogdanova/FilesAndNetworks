public class Screen {
    private final int diagonal;
    private final ScreenType type; //(IPS, TN, VA),
    private final double weight;

    public Screen(int diagonal, ScreenType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public Screen setDiagonal(int diagonal) {
        return new Screen(diagonal, type, weight);
    }

    public ScreenType getType() {
        return type;
    }


    public double getWeight() {
        return weight;
    }

    public Screen setWeight(int weight) {
        return new Screen(diagonal, type, weight);
    }

    public String toString() {
        return "Экран:" + "\n" + "* тип - " + getType() + "\n" + "* диагональ - " +
                getDiagonal() + "\n" + "* вес - " + getWeight();
    }
}

enum ScreenType {
    IPS, TN, VA
}
