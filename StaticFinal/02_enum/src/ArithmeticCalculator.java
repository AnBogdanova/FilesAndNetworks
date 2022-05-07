public class ArithmeticCalculator {
    private int a;
    private int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calculate(Operation operation) {
        switch (operation) {
            case ADD:
                System.out.println(a+b);
                break;
            case SUBTRACT :
                System.out.println(a-b);
                break;
            case MULTIPLY :
                System.out.println(a*b);
                break;
        }
    }

    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(8, 10);
        arithmeticCalculator.calculate(Operation.ADD);
        arithmeticCalculator.calculate(Operation.MULTIPLY);
        arithmeticCalculator.calculate(Operation.SUBTRACT);
    }
}
