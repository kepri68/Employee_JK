package pl.sda.employee.controller;

import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

public class EmployeeController {

    private EmployeeService employeeService;
    private EmployeeView employeeView;

    public EmployeeController(EmployeeView employeeView, EmployeeService employeeService){
        this.employeeService = employeeService;
        this.employeeView = employeeView;
    }
    public void prepareEmployee(){

    }
    public void showEmployee(){

    }


}
