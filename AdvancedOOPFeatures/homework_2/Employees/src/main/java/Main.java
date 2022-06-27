
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    private static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
        System.out.println(employeeMaxSalary);
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {
        //TODO Метод должен вернуть сотрудника с максимальной зарплатой среди тех,
        // кто пришёл в году, указанном в переменной year

        Optional<Employee> optional = staff.stream()
                .filter(e -> e.getWorkStart().toString().contains(Integer.toString(year)))
                .max(Comparator.comparing(Employee::getSalary));
        return optional.get();
    }
}