package pl.sda.employee.database;

import pl.sda.employee.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {

    public static List<Employee> employeeList = new ArrayList<>(
            Arrays.asList(new Employee("Jan", "Kowalski", 'M', 1),
                    new Employee("Michał", "Nowak", 'M', 2),
                    new Employee("Magda", "Nowak", 'K', 4),
                    new Employee("Jacek", "Wiśniewski", 'M', 2)
            )
    );


}
