package FirstPoint;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee (int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double plusSalary (double summ) {
        return summ * 2;
    }

    class EmployeeTest {
        public static void main (String[] args) {
            Employee employee = new Employee(522, "Maikov", 32, 50055.45, "Labor protection");
            employee.salary = employee.plusSalary(employee.salary);
            System.out.println("Hi, new salary: " + employee.surname + " " + employee.salary);
        }
    }
}
