package pl.sda.employee.service;

import pl.sda.employee.database.EmployeeDatabase;
import pl.sda.employee.model.Employee;

public class EmployeeService {

    //pobranie obiektu do serwisu
    public void addEmployee(Employee employee){
        //odwolanie sie do naszej listy
        EmployeeDatabase.employeeList.add(employee);

    }

}
