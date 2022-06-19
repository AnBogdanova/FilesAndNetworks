package CompanyProject;

public class TopManager implements Employee{
    private static final int FIXED_SALARY = 400000;
    @Override
    public int getMonthSalary() {
        if(Company.getIncome() > 10000000) {
            return (int) (FIXED_SALARY * 1.5 + FIXED_SALARY);
        }
        else {
            return FIXED_SALARY;
        }
    }
}
