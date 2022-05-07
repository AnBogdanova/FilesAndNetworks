public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 1,400);
        basket.add("Sugar", 100, 2, 100);
        basket.print("Milk");
        System.out.println("Стоимость корзины - " + basket.getTotalPrice());

        Basket basket1 = new Basket();
        basket1.add("bread", 50, 1, 150);
        System.out.println("Стоимость корзины - " + basket1.getTotalPrice());


        System.out.println("Количество корзин - " + Basket.getCount() + "\n" +
                "Средняя стоимость корзины - " + Basket.getAverageBasketCost() + "\n" +
                "Средняя стоимость продукта - " + Basket.getAverageProductPrice());
        System.out.println("Количество товаров во всех корзинах - " + Basket.getAllBasketsItemsCount());
        System.out.println("Общая стоимость всех корзин - " + Basket.getAllBasketCost());
    }
}
