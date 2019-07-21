package pl.sda.employee.controller;

import pl.sda.employee.model.Employee;
import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

import java.util.Scanner;

public class EmployeeController {

    private EmployeeService employeeService;
    private EmployeeView employeeView;

    public EmployeeController(EmployeeView employeeView, EmployeeService employeeService){
        this.employeeService = employeeService;
        this.employeeView = employeeView;
    }
    public void prepareEmployee(){

        //pobranie od urzytkownika danych
       Scanner scanner = new Scanner(System.in);
       String name = scanner.nextLine();
       String lastName = scanner.nextLine();
       char sex = scanner.next().charAt(0);
       int departmentNumber = scanner.nextInt();


       //tworzenie obiektu employee:
       Employee employee = new Employee(name, lastName, sex, departmentNumber);
       //odwolanie sie do pola employeeService i dodanie do niej danych z employee
       this.employeeService.addEmployee(employee);


    }

        //powinna pobrac od urzytkownika dane
        //i stworzyc obiekt employee
        //przeslanie obiektu do serwisu - addEmployee - w klasie EmployeeService

    public void showEmployee(){

        System.out.println("Wyświetlanie pracownika");
        this.employeeView.showAllEmployees();
    }


}
