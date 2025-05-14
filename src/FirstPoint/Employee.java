package FirstPoint;

public class Employee {

    public int id;
    String surname;
    int age;
    private double salary;
    String department;

    double SalaryPrintX2(double salary2) {
        salary = salary2;
        salary2 *= 2;
        return salary2;
    }

    void SurnamePrint(String surname2) {
        surname = surname2;
        System.out.println(surname2);
    }

    void IdPrint(int id2) {
        id = id2;
        System.out.println(id2);
    }

    class EmployeeTest {

        public static void main(String[] args) {
            Employee emp = new Employee();
            double salaryX2 = emp.SalaryPrintX2(500.1);
            System.out.println(salaryX2);
            emp.SurnamePrint("Bygrov");
            emp.IdPrint(55);
        }
    }
}
