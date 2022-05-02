public class CargoInfo {
    private final Demensions dimensions;
    private final int weight;
    private final String delivery_address;
    boolean isFliped;
    boolean isFragile;
    String registrationNumber;

    public CargoInfo(Demensions dimensions, int weight, String delivery_address) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.delivery_address = delivery_address;

    }

    public CargoInfo setDimensions(Demensions dimensions) {
        return new CargoInfo(dimensions, weight, delivery_address);
    }

    public Demensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public CargoInfo setWeight(int weight) {
        return new CargoInfo(dimensions, weight, delivery_address);
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public CargoInfo setDelivery_address(String delivery_address) {
        return new CargoInfo(dimensions, weight, delivery_address);
    }

    public boolean isFliped() {
        return isFliped;
    }

    public void setFliped(boolean fliped) {
        isFliped = fliped;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public void setFragile(boolean fragile) {
        isFragile = fragile;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String toString() {
        return "габариты груза: длина - " + dimensions.getLength() + ", ширина - "
                + dimensions.getWidth() + ", высота - " + dimensions.getHeight()
                + "\n" + "вес груза - " + getWeight() + "\n" +
                "адресс доставки - " + getDelivery_address();

    }


}
