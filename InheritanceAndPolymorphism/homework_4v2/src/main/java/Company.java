import java.util.*;

public class Company {
    protected static int income;
    private final List<Employee> employees = new ArrayList<>();

    public void setIncome(int income) {
        Company.income = income;
    }

    public static double getIncome() {
        return Company.income;
    }

    public Company() {
        new ArrayList<String>();
        setIncome(income);
    }

    public void hire(Employee employee) {
        this.employees.add(employee);
    }

    public void hireAll(Collection<Employee> employees) {
        this.employees.addAll(employees);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count > 0 && count <= countEmployees()) {
            return getFilteredLimitedList(count, new Comparator<>() {
                public int compare(Employee o1, Employee o2) {
                    return o2.getMonthSalary() - o1.getMonthSalary();
                }
            });
        }
        System.out.println("Некорректный ввод");
        return null;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        if (count > 0 && count <= countEmployees()) {
            return getFilteredLimitedList(count, new Comparator<>() {
                public int compare(Employee o1, Employee o2) {
                    return o1.getMonthSalary() - o2.getMonthSalary();
                }
            });
        }
        System.out.println("Некорректный ввод");
        return null;
    }

    private List<Employee> getFilteredLimitedList(int count, Comparator<Employee> comparator) {
        List<Employee> copyList = new ArrayList<>(employees);
        Collections.sort(copyList, comparator);
        List<Employee> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(copyList.get(i));
        }
        return result;
    }

    public int countEmployees() {
        return employees.size();
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
