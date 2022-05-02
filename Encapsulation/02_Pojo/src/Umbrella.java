public class Umbrella {
    private String brand;
    private String color;
    private int diameter;

    public Umbrella(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Umbrella(String brand, String color, int diameter) {
        this.brand = brand;
        this.color = color;
        this.diameter = diameter;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella("R_Lauren", "black", 100);
        System.out.println("Бренд - " + umbrella.getBrand());
        System.out.println("Цвет - " + umbrella.getColor());
        System.out.println("Диаметр купола - " + umbrella.getDiameter());
        umbrella.setBrand("CK");
        System.out.println("Бренд из сеттера - " + umbrella.getBrand());
        System.out.println("Всё работает))");
    }
}
