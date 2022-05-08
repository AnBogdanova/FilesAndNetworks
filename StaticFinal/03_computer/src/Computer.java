public class Computer {
    private final String name;
    private final String vendor;
    private CPU cpu;
    private RAM ram;
    private InformationStorage informationStorage;
    private Screen screen;
    private Keyboard keyboard;
    private static double computerWeight = 0;

    public Computer(String name, String vendor, CPU cpu, RAM ram,
                    InformationStorage informationStorage, Screen screen, Keyboard keyboard) {
        this.name = name;
        this.vendor = vendor;
        this.cpu = cpu;
        this.ram = ram;
        this.informationStorage = informationStorage;
        this.screen = screen;
        this.keyboard = keyboard;
        computerWeight = computerWeight + cpu.getWeight() + ram.getWeight() +
                informationStorage.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    public String getName() {return name;}
    public Computer setName(String name) {
        return new Computer(name, vendor,cpu,ram,informationStorage, screen,keyboard);
    }

    public String getVendor() {return vendor;}
    public Computer setVendor(String vendor) {
        return new Computer(name, vendor,cpu,ram,informationStorage, screen,keyboard);
    }

    public CPU getCpu() {return cpu;}
    public void setCpu(CPU cpu) {this.cpu = cpu;}

    public RAM getRam() {return ram;}
    public void setRam(RAM ram) {this.ram = ram;}

    public InformationStorage getInformationStorage() {return informationStorage;}
    public void setInformationStorage(InformationStorage informationStorage) {
        this.informationStorage = informationStorage;
    }

    public Screen getScreen() {return screen;}
    public void setScreen(Screen screen) {this.screen = screen;}

    public Keyboard getKeyboard() {return keyboard;}
    public void setKeyboard(Keyboard keyboard) {this.keyboard = keyboard;}

    public String toString() {
        return "Наименование - " + getName() + "\n" + "Производитель - " + getVendor() + "\n" + cpu.toString() +
                "\n" + ram.toString() + "\n" + informationStorage.toString() +
                "\n" + screen.toString() + "\n" + keyboard.toString() + "\n" +
                "Общий вес - " + getComputerWeight();

    }

    public static double getComputerWeight() {
        return computerWeight;
    }

}
