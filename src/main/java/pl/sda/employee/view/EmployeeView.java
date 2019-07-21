package pl.sda.employee.view;

import pl.sda.employee.database.EmployeeDatabase;
import pl.sda.employee.model.Employee;

public class EmployeeView {

    public void showAllEmployees(){
        //1. Imie: Nazwisko: Płeć:
        //2. Imię: Nazwisko: Płeć:
        int i = 1;
        for (Employee emp:EmployeeDatabase.employeeList){
            System.out.println("Imię: " + emp.getName() +
                    " \\Nazwisko: " + emp.getLastName() +
                    " \\Płeć: " + emp.getSex() +
                    " \\Numer: " + emp.getDepartmentNumber());
            i++;
        }


    }

}
