package main.java;

import main.java.Employee;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
        Comparator<Employee> bySalary = (s1, s2) -> {
            if (s1.getSalary().compareTo(s2.getSalary()) != 0)
                return s1.getSalary().compareTo(s2.getSalary());
            return s1.getName().compareTo(s2.getName());
        };
    }
}