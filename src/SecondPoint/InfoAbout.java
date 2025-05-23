package SecondPoint;

import FirstPoint.*;
import FirstPoint.Employee.EmployeeTest;

public class InfoAbout {
    public static void main (String[] args) {
        System.out.println(BankAccount.all);
        System.out.println(Employee.PI);
        System.out.println(printValue(ListNames.name2));
        System.out.println(EmployeeTest.Z);

    }

    public static String printValue(String value) {
        return value;
    }
}
