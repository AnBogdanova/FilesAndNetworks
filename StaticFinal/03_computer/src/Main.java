public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(4, 2, "Lenovo", 2.3);
        RAM ram = new RAM("DDR4", 8, 1);
        InformationStorage informationStorage = new InformationStorage(InformationStorageType.HDD, 256, 1);
        Screen screen = new Screen(18, ScreenType.IPS, 0.55);
        Keyboard keyboard = new Keyboard("Mechanical Keyboard", false, 0.7);
        Computer computer = new Computer("Lenovo IdeaCentre", "Lenovo", cpu, ram, informationStorage, screen, keyboard);
        System.out.println(computer);

    }
}
