package pl.sda.employee;

import pl.sda.employee.controller.EmployeeController;
import pl.sda.employee.database.EmployeeDatabase;
import pl.sda.employee.model.Employee;
import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(EmployeeDatabase.employeeList);
        //dodajemy jeszcze jednego pracownika do naszej listy:
        EmployeeDatabase.employeeList.add(
                new Employee("sad", "as", 'K', 32));
        System.out.println(EmployeeDatabase.employeeList);

        System.out.println("w. Dodaj pracownika");
        System.out.println("2. Pokaż pracownika");

        //wywołanie metody, gdzie urzytkownik bedzie musial podac dane:
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        EmployeeController controller = new EmployeeController(new EmployeeView(),
                new EmployeeService());

        switch (value){
            case 1:
                //metoda na dodanie
                break;
            case 2:
                //metoda na pokazanie
                break;
        }
    }
}
