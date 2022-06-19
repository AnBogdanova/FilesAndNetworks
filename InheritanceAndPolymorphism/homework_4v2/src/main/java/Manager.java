public class Manager implements Employee {
    private static final int FIXED_SALARY = 100000;
    private final int proceedsFromManager;
    protected final double bonus = 0.05;

    public Manager() {
        this.proceedsFromManager = (int) (Math.random() * 25000) + 115000;
    }
    @Override
    public int getMonthSalary() {
        return FIXED_SALARY + (int) (proceedsFromManager * bonus);
    }
}
