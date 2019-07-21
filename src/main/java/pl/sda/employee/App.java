package pl.sda.employee;

import pl.sda.employee.controller.EmployeeController;
import pl.sda.employee.database.EmployeeDatabase;
import pl.sda.employee.model.Employee;
import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(EmployeeDatabase.employeeList);
        //dodajemy jeszcze jednego pracownika do naszej listy:
        EmployeeDatabase.employeeList.add(
                new Employee("sad", "as", 'K', 32));
        System.out.println(EmployeeDatabase.employeeList);

        //wywołanie metody, gdzie urzytkownik bedzie musial podac dane:
        Scanner input = new Scanner(System.in);
      //  int value = input.nextInt();

        EmployeeController controller = new EmployeeController(new EmployeeView(),
                new EmployeeService());

        while (true) {

            System.out.println("1. Dodaj pracownika");
            System.out.println("2. Pokaż pracownika");
            int value = input.nextInt();
            if(value == 0) {
                break;
            }
            switch (value) {
                case 1:
                    //metoda na dodanie
                    controller.prepareEmployee();
                    break;
                case 2:
                    //metoda na pokazanie
                    controller.showEmployee();
                    break;
                case 0:
                    break;
            }

        }
    }
}
