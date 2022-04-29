public class Arithmetic {
    private int x;
    private int y;
    private int sum;
    private int productOfNumbers;
    private int min;
    private int max;


    public Arithmetic(int a, int b) {
        x = a;
        y = b;
    }

    public int  getSum() {return x + y;}

    int getProductOfNumbers() {return x * y;}

    int getMin() {
        if(x < y) {return x;}
        else {return y;}
    }
    int getMax() {
        if(x > y) {return x;}
        else {return y;}
    }

    public static void main(String[] args) {
        Arithmetic arithmetic1 = new Arithmetic(15,86);
        Arithmetic arithmetic2 = new Arithmetic(3, 4);
        System.out.println("sum(15, 86) = " + arithmetic1.getSum());
        System.out.println("sum(3, 4) = " + arithmetic2.getSum());
        System.out.println("productOfNumbers(15, 86) = " + arithmetic1.getProductOfNumbers());
        System.out.println("productOfNumbers(3, 4) = " + arithmetic2.getProductOfNumbers());
        System.out.println("min(15, 86) = " + arithmetic1.getMin());
        System.out.println("min(3, 4) = " + arithmetic2.getMin());
        System.out.println("max{15, 86) = " + arithmetic1.getMax());
        System.out.println("max{3, 4) = " + arithmetic2.getMax());
    }


}
