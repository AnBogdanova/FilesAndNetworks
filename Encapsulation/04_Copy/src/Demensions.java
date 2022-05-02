public class Demensions {
    private final int length;
    private final int width;
    private final int height;

    public Demensions(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Demensions setLength(int length) {
        return new Demensions(length, width, height);
    }
    public Demensions setWidth(int width) {
        return new Demensions(length, width, height);
    }

    public Demensions setHeight(int height) {
        return new Demensions(length, width, height);
    }

    public int getCargoVolume() {
        return length * width * height;
    }


}





