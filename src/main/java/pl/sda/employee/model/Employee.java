package pl.sda.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private String name;
    private String lastName;
    private char sex;
    private int departmentNumber;

}
