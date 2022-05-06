public class Main {
    public static void main(String[] args) {
        Demensions demensions = new Demensions(100, 150, 80);
        demensions = demensions.setWidth(120);
        demensions = demensions.setLength(200);
        demensions = demensions.setHeight(100);

        CargoInfo box = new CargoInfo(demensions, 60, "Moscow", true, false, "1546Df13");
        System.out.println(box);

        box = box.setDelivery_address("Tokyo");
        box = box.setWeight(80);
        System.out.println(box);



    }
}
