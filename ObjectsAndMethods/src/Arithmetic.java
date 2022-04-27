public class Arithmetic {
    private static int x;
    private static int y;
    private static int sum;
    private static int productOfNumbers;
    private static int min;
    private static int max;


    public Arithmetic(int a, int b) {
        x = a;
        y = b;
    }

    public int getSum() {return x + y;}

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
        Arithmetic arithmetic = new Arithmetic(15,86);
        sum = arithmetic.getSum();
        productOfNumbers = arithmetic.getProductOfNumbers();
        min = arithmetic.getMin();
        max = arithmetic.getMax();
    }


}
