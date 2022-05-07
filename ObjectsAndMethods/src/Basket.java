public class Basket {


    private static int count = 0;
    private static int basketCount = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    private static class AllBaskets {
        static int itemsCount = 0;
        static int allBasketCost = 0;
    }

    public Basket() {
        increaseCount(1);
        basketCount = basketCount + 1;
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1, 10.5);
    }

    public void add(String name, int price, int productCount) {
        add(name, price, productCount, 10.5);

    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. " + totalWeight + " г. -" + price;
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
        AllBaskets.itemsCount += count;
        AllBaskets.allBasketCost = AllBaskets.allBasketCost + price * count;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }



    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public static int getAllBasketsItemsCount() {
        return AllBaskets.itemsCount;
    }

    public static int getAllBasketCost() {
        return AllBaskets.allBasketCost;
    }

    public static int getAverageBasketCost() {
        return AllBaskets.allBasketCost / Basket.count;
    }

    public static double getAverageProductPrice() {
        return AllBaskets.allBasketCost / AllBaskets.itemsCount;
    }

}
