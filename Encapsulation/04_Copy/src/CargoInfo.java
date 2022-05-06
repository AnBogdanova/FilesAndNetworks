public class CargoInfo {
    private final Demensions dimensions;
    private final int weight;
    private final String delivery_address;
    private final boolean isFliped;
    private final boolean isFragile;
    private final String registrationNumber;

    public CargoInfo(Demensions dimensions, int weight,
                     String delivery_address, boolean isFliped,
                     boolean isFragile, String registrationNumber) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.delivery_address = delivery_address;
        this.isFliped = isFliped;
        this.isFragile = isFragile;
        this.registrationNumber = registrationNumber;
    }



    public CargoInfo setDimensions(Demensions dimensions) {
        return new CargoInfo(dimensions, weight, delivery_address, isFliped, isFragile, registrationNumber);
    }

    public Demensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public CargoInfo setWeight(int weight) {
        return new CargoInfo(dimensions, weight, delivery_address, isFliped, isFragile, registrationNumber);
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public CargoInfo setDelivery_address(String delivery_address) {
        return new CargoInfo(dimensions, weight, delivery_address, isFliped, isFragile, registrationNumber);
    }

    public CargoInfo setIsFliped(boolean isFliped) {
        return new CargoInfo(dimensions, weight, delivery_address, isFliped, isFragile, registrationNumber);
    }

    public boolean isFliped() {
        return isFliped;
    }


    public boolean isFragile() {
        return isFragile;
    }

    public CargoInfo setIsFragile(boolean isFragile) {
        return new CargoInfo(dimensions, weight, delivery_address, isFliped, isFragile, registrationNumber);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public CargoInfo setRegistrationNumber(String registrationNumber) {
        return new CargoInfo(dimensions, weight, delivery_address, isFliped, isFragile, registrationNumber);
    }

    public String toString() {
        return "габариты груза: длина - " + dimensions.getLength() + ", ширина - "
                + dimensions.getWidth() + ", высота - " + dimensions.getHeight()
                + "\n" + "вес груза - " + getWeight() + "\n" +
                "адресс доставки - " + getDelivery_address();

    }


}
